package com.uclan.fourweekchallenge.data.entity;

import javax.persistence.*;

@Entity
@Table(name="LOBBY")
public class Lobby {
    @Id
    @Column(name="LOBBY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lobbyId;

    @Column(name="NAME")
    private String name;

    @Column(name="MAP_ID")
    private long mapId;

    public long getLobbyId() {
        return lobbyId;
    }

    public void setLobbyId(long lobbyId) {
        this.lobbyId = lobbyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }
}
