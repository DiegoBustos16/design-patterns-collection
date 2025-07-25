package com.diegobustos.design_patterns_collection.behavioral.strategy;

public class UndercutOvertaking implements OvertakingStrategy {
    @Override
    public void overtake() {
        System.out.println("Overtake by entering the pits before.");
    }
}