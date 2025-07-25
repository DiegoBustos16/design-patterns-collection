package com.diegobustos.design_patterns_collection.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class RaceCar {
    private int position;
    private int speed;
    private final List<RaceObserver> observers = new ArrayList<>();

    public void addObserver(RaceObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(RaceObserver observer) {
        observers.remove(observer);
    }

    public void setPosition(int position) {
        this.position = position;
        notifyObservers();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        notifyObservers();
    }

    public int getPosition() {
        return position;
    }

    public int getSpeed() {
        return speed;
    }

    private void notifyObservers() {
        for (RaceObserver observer : observers) {
            observer.update(this);
        }
    }
}
