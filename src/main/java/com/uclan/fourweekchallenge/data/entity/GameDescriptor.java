package com.uclan.fourweekchallenge.data.entity;

import org.immutables.value.Value;

@Value.Immutable
public abstract class GameDescriptor {
    public abstract long gameId();
    public abstract int numPlayers();
    public abstract String mapName();
}
