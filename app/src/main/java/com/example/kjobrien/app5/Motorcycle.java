package com.example.kjobrien.app5;

public class Motorcycle extends Vehicle {

    // Contructor 1st thing to do to new Class.
    // I might want to create an object from the class

    public Motorcycle(int speed, boolean hasBreakingSystem, int numberOfWheels){

        super(speed, hasBreakingSystem, numberOfWheels);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
