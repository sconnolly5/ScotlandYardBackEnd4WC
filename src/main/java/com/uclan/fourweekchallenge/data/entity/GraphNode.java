package com.uclan.fourweekchallenge.data.entity;

import javax.persistence.*;

@Entity
@Table(name="GRAPH_NODE")
public class GraphNode {
    @Id
    @Column(name="NODE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long nodeId;

    @Column(name="PIXEL_X")
    private int pixelX;

    @Column(name="PIXEL_Y")
    private int pixelY;

    @Column(name="MAP_ID")
    private long mapId;

    public long getNodeId() {
        return nodeId;
    }

    public void setNodeId(long nodeId) {
        this.nodeId = nodeId;
    }

    public int getPixelX() {
        return pixelX;
    }

    public void setPixelX(int pixelX) {
        this.pixelX = pixelX;
    }

    public int getPixelY() {
        return pixelY;
    }

    public void setPixelY(int pixelY) {
        this.pixelY = pixelY;
    }

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }
}
