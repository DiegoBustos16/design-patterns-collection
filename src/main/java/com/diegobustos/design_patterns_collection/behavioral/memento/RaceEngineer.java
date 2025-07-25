package com.diegobustos.design_patterns_collection.behavioral.memento;

import java.util.Stack;

public class RaceEngineer {
    private final Stack<RaceCarMemento> history = new Stack<>();

    public void saveCheckpoint(RaceCar car) {
        System.out.println("Saving car state...");
        history.push(car.saveState());
    }

    public void restoreLastCheckpoint(RaceCar car) {
        if (!history.isEmpty()) {
            System.out.println("Restoring car to previous state...");
            car.restoreState(history.pop());
        } else {
            System.out.println("No previous state to restore.");
        }
    }
}