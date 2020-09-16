package com.uclan.fourweekchallenge.data.controller;

import com.uclan.fourweekchallenge.data.entity.Lobby;
import com.uclan.fourweekchallenge.data.entity.Player;
import com.uclan.fourweekchallenge.data.repository.LobbyRepository;
import com.uclan.fourweekchallenge.data.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/lobbies")
@CrossOrigin
public class LobbyController {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private LobbyRepository lobbyRepository;

    private static final int CODE_LENGTH = 4;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    
    @GetMapping
    public Iterable<Lobby> getLobbies() {
        return this.lobbyRepository.findAll();
    }
    
    @GetMapping("/create")
    public Lobby createLobby() {
        Iterable<Lobby> lobbies = this.lobbyRepository.findAll();
        String lobbyCode = getNewLobbyCode(lobbies);
        Lobby lobby = new Lobby();
        lobby.setName(lobbyCode);
        lobby.setMapId(0);
        this.lobbyRepository.save(lobby);
        return lobby;
    }
    
    @GetMapping("/destroy")
    public Map<String, Boolean> destroyLobby(@RequestParam String lobbyCode) {
        Lobby lobby = lobbyRepository.findLobbyByName(lobbyCode);
        if (lobby == null) {
            return Collections.singletonMap("success", false);
        }

        Iterable<Player> players = playerRepository.findByLobbyId(lobby.getLobbyId());
        playerRepository.deleteAll(players);
        lobbyRepository.delete(lobby);

        return Collections.singletonMap("success", true);
    }

    private String getNewLobbyCode(Iterable<Lobby> lobbies) {
        String lobbyCode = "";
        boolean lobbyIdGenerated = false;

        while (!lobbyIdGenerated) {
            
            Random r = new Random();
            StringBuilder randomString = new StringBuilder();
            for (int i = 0; i < CODE_LENGTH; i++) {
                randomString.append(ALPHABET.charAt(r.nextInt(ALPHABET.length())));
            }
            
            final String proposedCode = randomString.toString().toUpperCase();
            lobbyIdGenerated = StreamSupport
                    .stream(lobbies.spliterator(), false)
                    .map(Lobby::getName)
                    .noneMatch(o -> o.equals(proposedCode));
            lobbyCode = proposedCode;
        }
        return lobbyCode;
    }
}