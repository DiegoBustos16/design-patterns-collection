package com.diegobustos.design_patterns_collection.structural.decorator;

public abstract class RaceCarDecorator implements RaceCar {
    protected RaceCar decoratedCar;

    public RaceCarDecorator(RaceCar decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void assemble() {
        decoratedCar.assemble();
    }
}
