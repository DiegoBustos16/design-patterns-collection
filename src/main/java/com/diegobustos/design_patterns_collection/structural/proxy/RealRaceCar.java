package com.diegobustos.design_patterns_collection.structural.proxy;

public class RealRaceCar implements RaceCar {
    @Override
    public void drive() {
        System.out.println("Driving the real race car at full speed!");
    }
}
