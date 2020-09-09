package com.uclan.fourweekchallenge.data.entity;

import javax.persistence.*;

@Entity
@Table(name="MAP")
public class Map {
    @Id
    @Column(name = "MAP_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mapId;

    @Column(name="PATH")
    private String path;

    @Column(name="NAME")
    private String name;

    public long getMapId() {
        return mapId;
    }

    public void setMapId(long mapId) {
        this.mapId = mapId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
