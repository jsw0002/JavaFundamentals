package com.jordanwillis;

/**
 * Created by Jordan on 5/26/2016.
 */
public class Dresser {
    private int numOfDrawers;
    private Dimensions dimensions;

    public Dresser(int numOfDrawers, Dimensions dimensions) {
        this.numOfDrawers = numOfDrawers;
        this.dimensions = dimensions;
    }

    public int getNumOfDrawers() {
        return numOfDrawers;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
