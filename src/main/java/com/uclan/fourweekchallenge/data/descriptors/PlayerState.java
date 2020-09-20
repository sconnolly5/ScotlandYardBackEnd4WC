package com.uclan.fourweekchallenge.data.descriptors;

import com.uclan.fourweekchallenge.data.entity.GraphNode;

public class PlayerState {
    private int turnOrder;
    private String playerName;
    private GraphNode currentNode;
    private int yellowTickets;
    private int blueTickets;
    private int redTickets;

    public int getTurnOrder() {
        return turnOrder;
    }

    public void setTurnOrder(int turnOrder) {
        this.turnOrder = turnOrder;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public GraphNode getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(GraphNode currentNode) {
        this.currentNode = currentNode;
    }

    public int getYellowTickets() {
        return yellowTickets;
    }

    public void setYellowTickets(int yellowTickets) {
        this.yellowTickets = yellowTickets;
    }

    public int getBlueTickets() {
        return blueTickets;
    }

    public void setBlueTickets(int blueTickets) {
        this.blueTickets = blueTickets;
    }

    public int getRedTickets() {
        return redTickets;
    }

    public void setRedTickets(int redTickets) {
        this.redTickets = redTickets;
    }
}
