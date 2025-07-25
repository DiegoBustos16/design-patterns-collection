package com.diegobustos.design_patterns_collection.behavioral.strategy;

public class SpeedOvertaking implements OvertakingStrategy {
    @Override
    public void overtake() {
        System.out.println("Overtake using greater speed on a straight.");
    }
}
