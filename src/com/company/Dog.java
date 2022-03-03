package com.company;

public class Dog extends Animal implements Mover{

    private boolean canBark;

    public Dog(int numLegs, boolean canBark){
        super(numLegs);
        this.canBark = canBark;
    }
    @Override
    public double move(){
        setSpeed(15);
        System.out.println("The dog is moving at "+getSpeed());
        return getSpeed();
    }

    public void outputDetails(){
        super.outputDetails();
        System.out.println("This dog can bark? "+canBark);
    }
}
