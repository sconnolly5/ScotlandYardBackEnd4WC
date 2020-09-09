package com.uclan.fourweekchallenge.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "EDGE")
public class Edge {
    @Id
    @Column(name="EDGE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long edgeId;

    @Column(name="MAP_ID")
    private long mapId;

    @Column(name="GRAPH_NODE_A")
    private long nodeAId;

    @Column(name="GRAPH_NODE_B")
    private long nodeBId;

    @Column(name="COLOUR_ID")
    private long colourId;

    public long getEdgeId() {
        return edgeId;
    }

    public void setEdgeId(long edgeId) {
        this.edgeId = edgeId;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public long getNodeAId() {
        return nodeAId;
    }

    public void setNodeAId(long nodeAId) {
        this.nodeAId = nodeAId;
    }

    public long getNodeBId() {
        return nodeBId;
    }

    public void setNodeBId(long nodeBId) {
        this.nodeBId = nodeBId;
    }

    public long getColourId() {
        return colourId;
    }

    public void setColourId(long colourId) {
        this.colourId = colourId;
    }
}
