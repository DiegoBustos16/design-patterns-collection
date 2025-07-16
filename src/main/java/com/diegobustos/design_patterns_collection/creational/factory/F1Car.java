package com.diegobustos.design_patterns_collection.creational.factory;

public class F1Car implements RacingCar{
    @Override
    public String topSpeed() {
        return "F1 car: top speed is ~360 km/h.";
    }
}
