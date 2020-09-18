package com.uclan.fourweekchallenge.data.controller;

import com.uclan.fourweekchallenge.data.entity.Game;
import com.uclan.fourweekchallenge.data.entity.Player;
import com.uclan.fourweekchallenge.data.repository.GameRepository;
import com.uclan.fourweekchallenge.data.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/games")
@CrossOrigin
public class GameController {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private GameRepository gameRepository;
    
    @GetMapping
    public Iterable<Game> getGames() {
        return this.gameRepository.findAll();
    }
    
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