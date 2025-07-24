package com.diegobustos.design_patterns_collection.structural.decorator;

public class EngineDecorator extends RaceCarDecorator {

    public EngineDecorator(RaceCar decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + Engine");
    }
}
