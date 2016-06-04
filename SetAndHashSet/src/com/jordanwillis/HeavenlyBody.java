package com.jordanwillis;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jordan on 6/3/2016.
 */
public abstract class HeavenlyBody {
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Key key;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    // could use below instead of enum
//    public static final int STAR = 1;
//    public static final int PLANET = 2;
//    public static final int DWARF_PLANET = 3;
//    public static final int MOON = 4;
//    public static final int COMET = 5;
//    public static final int ASTEROID = 6;

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();

    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyTypes){
        return new Key(name, bodyTypes);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyTypes + ", " + this.orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyTypes;

        private Key(String name, BodyTypes bodyTypes){
            this.name = name;
            this.bodyTypes = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())){
                return (this.bodyTypes == key.getBodyTypes());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyTypes.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyTypes;
        }
    }
}
