package com.diegobustos.design_patterns_collection.structural.decorator;

public class BasicRaceCar implements RaceCar {
    @Override
    public void assemble() {
        System.out.print("Basic race car");
    }
}
