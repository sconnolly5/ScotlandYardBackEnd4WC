package com.uclan.fourweekchallenge.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "COLOUR")
public class Colour {
    @Id
    @Column(name="COLOUR_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long colourId;

    @Column(name="COLOUR_NAME")
    private String colourName;

    public long getColourId() {
        return colourId;
    }

    public void setColourId(long colourId) {
        this.colourId = colourId;
    }

    public String getColourName() {
        return colourName;
    }

    public void setColourName(String colourName) {
        this.colourName = colourName;
    }
}
