package com.jordanwillis;

/**
 * Created by Jordan on 6/1/2016.
 */
public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName(){
        return name;
    }
}
