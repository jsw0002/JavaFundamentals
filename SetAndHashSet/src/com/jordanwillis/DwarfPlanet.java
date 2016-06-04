package com.jordanwillis;

/**
 * Created by Jordan on 6/4/2016.
 */
public class DwarfPlanet extends HeavenlyBody {
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
}
