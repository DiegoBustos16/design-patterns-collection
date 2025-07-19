package com.diegobustos.design_patterns_collection.creational.abstractFactory;

public class NascarTeamFactory implements RacingTeamFactory {
    @Override
    public RacingCar createCar() {
        return new NascarCar();
    }

    @Override
    public Engine createEngine() {
        return new NascarEngine();
    }
}
