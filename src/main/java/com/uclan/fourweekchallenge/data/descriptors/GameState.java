package com.uclan.fourweekchallenge.data.descriptors;

import java.util.Map;

public class GameState {
    private String mapFile;

    private boolean gameOver;

    private int currentTurn;

    private int currentTurnOrder;

    private Iterable<PlayerState> players;

    private Map<Integer, String> mrXMovements;

    private int mrXLastKnownLocation;

    public String getMapFile() {
        return mapFile;
    }

    public void setMapFile(String mapFile) {
        this.mapFile = mapFile;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
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

    public Iterable<PlayerState> getPlayers() {
        return players;
    }

    public void setPlayers(Iterable<PlayerState> players) {
        this.players = players;
    }

    public Map<Integer, String> getMrXMovements() {
        return mrXMovements;
    }

    public void setMrXMovements(Map<Integer, String> mrXMovements) {
        this.mrXMovements = mrXMovements;
    }

    public int getMrXLastKnownLocation() {
        return mrXLastKnownLocation;
    }

    public void setMrXLastKnownLocation(int mrXLastKnownLocation) {
        this.mrXLastKnownLocation = mrXLastKnownLocation;
    }
}
