package com.coltec.cfgs.airport.classes;


/**
 * Created by a2016953173 on 13/09/18.
 */

public class LandingStrip {
    private String name;
    private double capacity;//qts avioes cabem
    City local;

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

}
