package com.company;

public class Airplane extends Vehicle implements Mover{

    private boolean hasWings;

    public Airplane(int numWheels, boolean hasWings){
        super(numWheels);
        this.hasWings = hasWings;
    }
    @Override
    public double move(){
        setSpeed(500);
        System.out.println("The airplane is now moving at "+getSpeed());
        return getSpeed();
    }

    @Override
    public void outputDetails(){
        super.outputDetails();
        System.out.println("This plane has wings? "+hasWings);
    }


}
