package com.company;

import java.util.ArrayList;
import java.util.List;

public class RadarSpeedGun {


    List<Mover> movingThings = new ArrayList<>();
    private double totalSpeed =0;


    public void makeItMove(Mover mover){
        totalSpeed = totalSpeed + mover.move();
    }

}
