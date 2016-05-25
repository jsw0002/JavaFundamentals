package com.jordanwillis;

/**
 * Created by Jordan on 5/25/2016.
 */
public class Toyota extends Car {
    private String model;
    private int year;

    public Toyota(String color, int wheels, int doors, boolean spareTire, int mpg) {
        super(color, wheels, doors, spareTire, mpg);
        this.model = "Camry";
        this.year = 2000;
    }

    public Toyota(String color, int wheels, int doors, boolean spareTire, int mpg, String model, int year) {
        super(color, wheels, doors, spareTire, mpg);
        this.model = model;
        this.year = year;
    }

    @Override
    public void moving(int speed) {
        System.out.println("Toyota Camry is moving at " + speed + " mph.");
    }

    @Override
    public void changeGears(int gear) {
        System.out.println("Toyota Camry is in " + gear + ".");
    }

    @Override
    public void steering(boolean isLeft) {
        if (isLeft == true){
            System.out.println("Toyota Camry is turning left.");
        } else {
            System.out.println("Toyota Camry is turning right.");
        }
    }

    public String getModel() {
        System.out.println(model);
        return model;
    }

    public int getYear() {
        return year;
    }
}
