package com.uclan.fourweekchallenge.data.controller;

import com.uclan.fourweekchallenge.data.entity.Lobby;
import com.uclan.fourweekchallenge.data.repository.LobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lobbies")
public class LobbyController {
    @Autowired
    private LobbyRepository lobbyRepository;

    @GetMapping
    public Iterable<Lobby> getLobbies() {
        return this.lobbyRepository.findAll();
    }
}