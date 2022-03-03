package com.company;

import java.util.ArrayList;
import java.util.List;

public class RadarSpeedGun {


    List<Mover> movingThings = new ArrayList<>();
    private double totalSpeed;

    public RadarSpeedGun(){
        totalSpeed = 0;
    }

    public double getTotalSpeed() {
        return totalSpeed;
    }

    public void makeItMove(Mover mover){
        totalSpeed = totalSpeed + mover.move();
        movingThings.add(mover);
    }

    public void outputDetails(){
        for(int i=0; i<movingThings.size(); i++){
            movingThings.get(i).outputDetails();
            System.out.println(" ");
        }
    }

}
