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

    @Column(name="CURRENT_TURN")
    private int currentTurn;

    @Column(name="CURRENT_TURN_ORDER")
    private int currentTurnOrder;

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

    public int getCurrentTurn() {
        return currentTurn;
    }

    public void setCurrentTurn(int currentTurn) {
        this.currentTurn = currentTurn;
    }

    public int getCurrentTurnOrder() {
        return currentTurnOrder;
    }

    public void setCurrentTurnOrder(int currentTurnOrder) {
        this.currentTurnOrder = currentTurnOrder;
    }
}
