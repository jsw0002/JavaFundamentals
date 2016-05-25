package com.jordanwillis;

/**
 * Created by Jordan on 5/25/2016.
 */
public class Vehicle {
    private String color;
    private int wheels;
    private int doors;

    public Vehicle(String color, int wheels, int doors) {
        this.color = color;
        this.wheels = wheels;
        this.doors = doors;
    }

    public void moving(int speed){
        System.out.println("Vehicle is moving at " + speed + " mph.");
    }

    public void changeGears(int gear){
        System.out.println("Vehicle is in " + gear + ".");
    }

    public void steering(boolean isLeft){
        if (isLeft == true){
            System.out.println("Vehicle is turning left.");
        } else {
            System.out.println("Vehicle is turning right.");
        }
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
}
