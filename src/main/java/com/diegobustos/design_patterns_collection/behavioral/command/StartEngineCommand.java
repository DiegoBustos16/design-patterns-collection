package com.diegobustos.design_patterns_collection.behavioral.command;

public class StartEngineCommand implements Command {
    private final RaceCar raceCar;

    public StartEngineCommand(RaceCar raceCar) {
        this.raceCar = raceCar;
    }

    @Override
    public void execute() {
        raceCar.startEngine();
    }
}
