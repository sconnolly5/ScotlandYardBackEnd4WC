package com.uclan.fourweekchallenge.data.controller;

import com.uclan.fourweekchallenge.data.entity.Lobby;
import com.uclan.fourweekchallenge.data.repository.LobbyRepository;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lobbies")
@CrossOrigin
public class LobbyController {
    @Autowired
    private LobbyRepository lobbyRepository;

    private static final int CODE_LENGTH = 4;
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    
    @GetMapping("/")
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

    private String getNewLobbyCode(Iterable<Lobby> lobbies) {
        String lobbyCode = "";
        boolean lobbyIdGenerated = false;

        while (!lobbyIdGenerated) {
            
            Random r = new Random();
            String randomString = "";
            for (int i = 0; i < CODE_LENGTH; i++) {
                randomString += ALPHABET.charAt(r.nextInt(ALPHABET.length()));
            }
            
            final String proposedCode = randomString.toUpperCase();
            lobbyIdGenerated = !StreamSupport
                    .stream(lobbies.spliterator(), false)
                    .map(o -> o.getName())
                    .anyMatch(o -> o.equals(proposedCode));
            lobbyCode = proposedCode;
        }
        return lobbyCode;
    }
}