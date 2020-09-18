package com.uclan.fourweekchallenge.data.entity;

import javax.persistence.*;

@Entity
@Table(name="GAME")
public class Game {
    @Id
    @Column(name="GAME_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gameId;

    @Column(name="MAP_ID")
    private long mapId;

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }
}
