package com.company;

public class Animal implements Mover{

    private int numLegs;
    private double speed;

    public Animal(int numLegs){
        this.numLegs = numLegs;
        this.speed = 0;
    }

    public int getNumLegs(){
        return numLegs;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }

    @Override
    public double move(){
        speed = 10;
        System.out.println("The animal is moving at a default speed of "+speed);
        return speed;
    }

    public void outputDetails(){
        System.out.println("This animal has "+numLegs+" legs, and is moving at "+speed+".");
    }

}
