package com.diegobustos.design_patterns_collection.creational.abstractFactory;

public class F1TeamFactory implements RacingTeamFactory {
    @Override
    public RacingCar createCar() {
        return new F1Car();
    }

    @Override
    public Engine createEngine() {
        return new F1Engine();
    }
}
