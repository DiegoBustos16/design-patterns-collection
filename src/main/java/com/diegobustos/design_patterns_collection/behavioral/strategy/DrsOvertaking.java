package com.diegobustos.design_patterns_collection.behavioral.strategy;

public class DrsOvertaking implements OvertakingStrategy {
    @Override
    public void overtake() {
        System.out.println("Overtake using DRS in the permitted zone.");
    }
}
