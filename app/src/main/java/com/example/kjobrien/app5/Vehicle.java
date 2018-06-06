package com.example.kjobrien.app5;

public class Vehicle {

    //Instance variables
    private  int speed;
    private final boolean hasBreakingSystem;
    private  int numberOfWheels;

    private  int rideSpeed;

    //Constructor
    public  Vehicle(int speed, boolean hasBreakingSystem, int numberOfWheels) {

        this.speed = speed;
        this.hasBreakingSystem = hasBreakingSystem;
        this.numberOfWheels = numberOfWheels;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getHasBreakingSystem() {
        return hasBreakingSystem;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getRideSpeed() {
        return rideSpeed;
    }

    public void ride(){

        int result = getSpeed() * getNumberOfWheels();
        rideSpeed = result;

    }
}
