package com.diegobustos.design_patterns_collection.creational.factory;

public class NascarCar implements RacingCar {
    @Override
    public String topSpeed() {
        return "NASCAR car: top speed is ~320 km/h.";
    }
}