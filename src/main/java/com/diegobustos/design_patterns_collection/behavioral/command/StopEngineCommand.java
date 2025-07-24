package com.diegobustos.design_patterns_collection.behavioral.command;

public class StopEngineCommand implements Command {
    private final RaceCar raceCar;

    public StopEngineCommand(RaceCar raceCar) {
        this.raceCar = raceCar;
    }

    @Override
    public void execute() {
        raceCar.stopEngine();
    }
}