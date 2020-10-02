package com.uclan.fourweekchallenge.data.entity;

import javax.persistence.*;

@Entity
@Table(name="PLAYER")
public class Player {

    @Id
    @Column(name = "PLAYER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long playerId;

    @Column(name="NICKNAME")
    private String nickName;

    @Column(name="IS_MR_X")
    private boolean isMrX;

    @Column(name="CURRENT_NODE")
    private long currentNode;

    @Column(name="GAME_ID")
    private long gameId;

    @Column(name="TURN_ORDER")
    private int turnOrder;

    @Column(name="YELLOW_TICKETS")
    private int yellowTickets;

    @Column(name="BLUE_TICKETS")
    private int blueTickets;

    @Column(name="RED_TICKETS")
    private int redTickets;

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public boolean isMrX() {
        return isMrX;
    }

    public void setMrX(boolean mrX) {
        isMrX = mrX;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(long currentNode) {
        this.currentNode = currentNode;
    }

    public int getTurnOrder() {
        return turnOrder;
    }

    public void setTurnOrder(int turnOrder) {
        this.turnOrder = turnOrder;
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
