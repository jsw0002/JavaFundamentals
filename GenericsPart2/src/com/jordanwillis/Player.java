package com.jordanwillis;

/**
 * Created by Jordan on 6/2/2016.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
