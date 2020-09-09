package com.uclan.fourweekchallenge.business.service;

import com.uclan.fourweekchallenge.business.domain.PopulatedLobby;
import com.uclan.fourweekchallenge.data.entity.Lobby;
import com.uclan.fourweekchallenge.data.repository.LobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LobbyService {
    private final LobbyRepository lobbyRepository;

    @Autowired
    public LobbyService(LobbyRepository lobbyRepository) {
        this.lobbyRepository = lobbyRepository;
    }

    public List<PopulatedLobby> getLobbyForName(String name) {
        Iterable<Lobby> lobbies = this.lobbyRepository.findAll();
        lobbies.forEach(lobby -> {
            PopulatedLobby populatedLobby = new PopulatedLobby();
            populatedLobby.setLobbyId(lobby.getLobbyId());
            populatedLobby.

        });
        return null;
    }
}
