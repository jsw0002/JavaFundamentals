package com.jordanwillis;

/**
 * Created by Jordan on 5/26/2016.
 */
public class Bedroom {
    private Bed bed;
    private Dresser dresser;
    private Mirror mirror;

    public Bedroom(Bed bed, Dresser dresser, Mirror mirror) {
        this.bed = bed;
        this.dresser = dresser;
        this.mirror = mirror;
    }

    public void IsWifeSuperHappy(){
        mirror.cleanMirror();
        isWifeHappy();
        System.out.println("You no longer have to get me an anniversary gift.");
    }

    private void isWifeHappy(){
        bed.makeBed();
        System.out.println("Your the best husband ever!");
    }

    public Bed getBed() {
        return bed;
    }

    public Dresser getDresser() {
        return dresser;
    }

    public Mirror getMirror() {
        return mirror;
    }
}
