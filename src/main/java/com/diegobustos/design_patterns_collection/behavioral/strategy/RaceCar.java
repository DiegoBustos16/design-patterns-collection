package com.diegobustos.design_patterns_collection.behavioral.strategy;

public class RaceCar {
    private OvertakingStrategy strategy;

    public RaceCar(OvertakingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setOvertakingStrategy(OvertakingStrategy strategy) {
        this.strategy = strategy;
    }

    public void tryToOvertake() {
        strategy.overtake();
    }
}
