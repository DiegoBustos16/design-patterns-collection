package com.diegobustos.design_patterns_collection.creational.abstractFactory;
//This is the abstract factory

public interface RacingTeamFactory {
    RacingCar createCar();
    Engine createEngine();
}
