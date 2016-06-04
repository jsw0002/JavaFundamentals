package com.jordanwillis;

/**
 * Created by Jordan on 6/4/2016.
 */
public class Moon extends HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
