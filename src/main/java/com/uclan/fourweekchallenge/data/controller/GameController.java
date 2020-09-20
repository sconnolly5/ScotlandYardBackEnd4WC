package com.uclan.fourweekchallenge.data.controller;

import com.google.common.collect.Lists;
import com.uclan.fourweekchallenge.data.descriptors.*;
import com.uclan.fourweekchallenge.data.entity.*;
import com.uclan.fourweekchallenge.data.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/games")
@CrossOrigin
public class GameController {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private MapRepository mapRepository;

    @Autowired
    private GraphNodeRepository graphNodeRepository;

    @Autowired
    private MrXMovementRepository mrXMovementRepository;

    @Autowired
    private ColourRepository colourRepository;

    @GetMapping
    public Iterable<Game> getGames() {
        return this.gameRepository.findAll();
    }

    @GetMapping("/descriptors")
    public Map<Integer, GameDescriptor> getGameDescriptors() {
        Map<Integer, GameDescriptor> results = new HashMap<>();
        Iterable<Game> games = this.gameRepository.findAll();
        games.forEach(game -> {
            int numPlayers = Lists.newArrayList(playerRepository.findByGameId(game.getGameId())).size();
            Optional<com.uclan.fourweekchallenge.data.entity.Map> map = mapRepository.findById(game.getMapId());
            String mapName = "";
            if (map.isPresent()) {
                mapName = map.get().getName();
            }

            GameDescriptor gameDescriptor = new GameDescriptor();
            gameDescriptor.setGameId(game.getGameId());
            gameDescriptor.setMapName(mapName);
            gameDescriptor.setNumPlayers(numPlayers);
            results.put(results.size(), gameDescriptor);
        });
        return results;
    }

    @GetMapping("/state")
    public GameState getGameState(@RequestParam long gameId) {
        Optional<Game> game = this.gameRepository.findById(gameId);
        GameState result = null;
        if (game.isPresent()) {
            Optional<com.uclan.fourweekchallenge.data.entity.Map> map = mapRepository.findById(game.get().getMapId());
            String mapPath = "";
            if (map.isPresent()) {
                mapPath = map.get().getPath();
            }

            // Gets the current state of players
            Stream<PlayerState> playerStates = StreamSupport
                    .stream(playerRepository.findByGameId(gameId).spliterator(), false)
                    .map(player -> {
                        Optional<GraphNode> currentNode = graphNodeRepository.findById(player.getCurrentNode());

                        return currentNode.map(graphNode -> {
                            PlayerState playerState = new PlayerState();
                            playerState.setPlayerName(player.getNickName());
                            playerState.setCurrentNode(graphNode);
                            playerState.setTurnOrder(player.getTurnOrder());
                            // TODO:
                            // Should return correct number of tickets, 0 acting as placeholder
                            playerState.setBlueTickets(0);
                            playerState.setYellowTickets(0);
                            playerState.setRedTickets(0);
                            return playerState;
                        })
                                .orElse(null);
                    });

            Optional<Player> mrXPlayer = StreamSupport
                    .stream(playerRepository.findAll().spliterator(), false)
                    .filter(Player::isMrX)
                    .findFirst();

            boolean gameOver = false;
            if (mrXPlayer.isPresent()) {
                gameOver = StreamSupport
                        .stream(playerRepository.findAll().spliterator(), false)
                        .filter(o -> !o.isMrX())
                        .anyMatch(o -> o.getCurrentNode() == mrXPlayer.get().getCurrentNode());
            }

            result = new GameState();
            result.setMapFile(mapPath);
            result.setGameOver(gameOver);
            result.setCurrentTurn(game.get().getCurrentTurn());
            result.setCurrentTurnOrder(game.get().getCurrentTurnOrder());
            result.setMrXMovements(GetMrXMovements());
            result.setMrXLastKnownLocation(getMrXLastKnownLocation());
            result.setPlayers(playerStates::iterator);
        }
        return result;
    }

    private int getMrXLastKnownLocation() {
        Optional<MrXMovement> latestTurn = StreamSupport.stream(mrXMovementRepository.findAll().spliterator(), false)
                .filter(o -> !o.isReveal())
                .max(Comparator.comparing(MrXMovement::getTurn));
        return latestTurn.map(MrXMovement::getTurn).orElse(-1);
    }

    private Map<Integer, String> GetMrXMovements() {
        return StreamSupport
                .stream(mrXMovementRepository
                        .findAll()
                        .spliterator(), false)
                .collect(Collectors.toMap(
                        MrXMovement::getTurn,
                        (e) -> {
                            Optional<Colour> colour = colourRepository.findById(e.getColourId());
                            if (colour.isPresent()) {
                                return colour.get().getColourName();
                            }
                            return "NOT FOUND";
                        }
                ));
    }
}