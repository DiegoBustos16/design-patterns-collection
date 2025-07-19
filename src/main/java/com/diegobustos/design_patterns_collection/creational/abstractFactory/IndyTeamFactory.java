package com.diegobustos.design_patterns_collection.creational.abstractFactory;

public class IndyTeamFactory implements RacingTeamFactory {
    @Override
    public RacingCar createCar() {
        return new IndyCar();
    }

    @Override
    public Engine createEngine() {
        return new IndyEngine();
    }
}
