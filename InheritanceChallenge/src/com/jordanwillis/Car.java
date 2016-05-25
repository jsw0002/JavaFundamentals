package com.jordanwillis;

/**
 * Created by Jordan on 5/25/2016.
 */
public class Car extends Vehicle {
    private boolean spareTire;
    private int mpg;

    public Car(String color, int wheels, int doors, boolean spareTire, int mpg) {
        super(color, wheels, doors);
        this.spareTire = spareTire;
        this.mpg = mpg;
    }

    @Override
    public void moving(int speed) {
        System.out.println("Car is moving at " + speed + " mph.");
    }

    @Override
    public void changeGears(int gear) {
        System.out.println("Car is in " + gear + ".");
    }

    @Override
    public void steering(boolean isLeft) {
        if (isLeft == true){
            System.out.println("Car is turning left.");
        } else {
            System.out.println("Car is turning right.");
        }
    }

    public boolean isSpareTire() {
        return spareTire;
    }

    public int getMpg() {
        return mpg;
    }
}
