package com.jordanwillis;

public class Main {

    public static void main(String[] args) {

        // Challenge
        // Start with a base class of Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to handle steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviors (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For your specific type of vehicle you will want to add something specific for that type of car.

        Vehicle randomVehicle = new Vehicle("Black", 6, 2);
        Car randomCar = new Car("Blue", 4, 4, false, 25);
        Toyota camry = new Toyota("Gold", 4, 4, true, 32);

        camry.getModel();
        camry.changeGears(4);
        randomCar.moving(55);
        randomVehicle.steering(true);
    }
}
