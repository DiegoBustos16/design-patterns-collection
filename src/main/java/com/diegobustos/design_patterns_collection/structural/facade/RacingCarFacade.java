package com.diegobustos.design_patterns_collection.structural.facade;

public class RacingCarFacade {
    private Engine engine;
    private Tires tires;
    private FuelSystem fuelSystem;

    public RacingCarFacade() {
        this.engine = new Engine();
        this.tires = new Tires();
        this.fuelSystem = new FuelSystem();
    }

    public void prepareForRace() {
        fuelSystem.fillUp();
        tires.warm();
        engine.start();
        System.out.println("Car is ready for the race!");
    }
}
