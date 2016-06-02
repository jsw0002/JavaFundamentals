package com.jordanwillis;

/**
 * Created by Jordan on 6/1/2016.
 */
public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
}
