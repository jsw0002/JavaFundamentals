package com.jordanwillis;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class Porche extends Car {
    public Porche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Porche -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Porche -> accelerate()";
    }

    @Override
    public String brake() {
        return "Porche -> brake()";
    }
}

class Honda extends Car {
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Honda -> brake()";
    }
}

class Ford extends Car {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Porche porche = new Porche("Carera", 8);
        System.out.println(porche.startEngine());
        System.out.println(porche.accelerate());
        System.out.println(porche.brake());

        Honda honda = new Honda("Accord", 4);
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());

        Ford ford = new Ford("Fusion", 6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
