package com.uclan.fourweekchallenge.data.entity;

import javax.persistence.*;

@Entity
@Table(name="MR_X_MOVEMENT")
public class MrXMovement {
    @Id
    @Column(name = "MOVEMENT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long movementId;

    @Column(name="GAME_ID")
    private long gameId;

    @Column(name="NODE_ID")
    private long nodeId;

    @Column(name="REVEAL")
    private boolean reveal;

    @Column(name="TURN")
    private int turn;

    @Column(name="COLOUR_ID")
    private long colourId;

    public long getMovementId() {
        return movementId;
    }

    public void setMovementId(long movementId) {
        this.movementId = movementId;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public long getNodeId() {
        return nodeId;
    }

    public void setNodeId(long nodeId) {
        this.nodeId = nodeId;
    }

    public boolean isReveal() {
        return reveal;
    }

    public void setReveal(boolean reveal) {
        this.reveal = reveal;
    }

    public long getColourId() {
        return colourId;
    }

    public void setColourId(long colourId) {
        this.colourId = colourId;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
