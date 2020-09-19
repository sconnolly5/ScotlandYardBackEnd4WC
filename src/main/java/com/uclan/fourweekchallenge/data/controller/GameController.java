package com.uclan.fourweekchallenge.data.controller;

import com.google.common.collect.Lists;
import com.uclan.fourweekchallenge.data.entity.Game;
import com.uclan.fourweekchallenge.data.entity.GameDescriptor;
import com.uclan.fourweekchallenge.data.entity.ImmutableGameDescriptor;
import com.uclan.fourweekchallenge.data.entity.Player;
import com.uclan.fourweekchallenge.data.repository.GameRepository;
import com.uclan.fourweekchallenge.data.repository.MapRepository;
import com.uclan.fourweekchallenge.data.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
            GameDescriptor gameDescriptor = ImmutableGameDescriptor
                    .builder()
                    .gameId(game.getGameId())
                    .numPlayers(numPlayers)
                    .mapName(mapName)
                    .build();

            results.put(results.size(), gameDescriptor);
        });
        return results;
    }

//    @GetMapping("/state")
//    public Map<Integer, >

    @GetMapping("/create")
    public Game createGame() {
        Iterable<Game> games = this.gameRepository.findAll();
        Game game = new Game();
        game.setMapId(0);
        this.gameRepository.save(game);
        return game;
    }

    @GetMapping("/destroy")
    public Map<String, Boolean> destroyGame(@RequestParam long gameId) {
        Game game = gameRepository.findByGameId(gameId);
        if (game == null) {
            return Collections.singletonMap("success", false);
        }

        Iterable<Player> players = playerRepository.findByGameId(game.getGameId());
        playerRepository.deleteAll(players);
        gameRepository.delete(game);

        return Collections.singletonMap("success", true);
    }
}