package com.company;

public class Vehicle implements Mover{

    private int numWheels;
    private double speed;

    public Vehicle(int numWheels){
        this.numWheels = numWheels;
        this.speed = 0;
    }

    public int getNumWheels(){
        return numWheels;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }
    @Override
    public double move(){
        speed = 60;
        System.out.println("The vehicle is moving at a default speed of "+speed);
        return speed;
    }

    public void outputDetails(){
        System.out.println("This vehicle has "+numWheels+" wheels, and is moving at "+speed+".");
    }
}
