package com.diegobustos.design_patterns_collection.creational.abstractFactory;

public class IndyCar implements RacingCar {
    @Override
    public String topSpeed() {
        return "IndyCar: top speed is ~380 km/h.";
    }
}
