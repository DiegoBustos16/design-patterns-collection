package com.diegobustos.design_patterns_collection.structural.decorator;

public class TireDecorator extends RaceCarDecorator {

    public TireDecorator(RaceCar decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + Tires");
    }
}
