package com.diegobustos.design_patterns_collection.behavioral.memento;

public class RaceCarMemento {
    private final int speed;
    private final int fuel;
    private final int position;

    public RaceCarMemento(int speed, int fuel, int position) {
        this.speed = speed;
        this.fuel = fuel;
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public int getPosition() {
        return position;
    }
}
