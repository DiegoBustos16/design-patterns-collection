package com.diegobustos.design_patterns_collection.behavioral.memento;

public class RaceCar {
    private int speed;
    private int fuel;
    private int position;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void showStatus() {
        System.out.println("Speed: " + speed + " km/h, Fuel: " + fuel + "%, Position: " + position);
    }

    public RaceCarMemento saveState() {
        return new RaceCarMemento(speed, fuel, position);
    }

    public void restoreState(RaceCarMemento memento) {
        this.speed = memento.getSpeed();
        this.fuel = memento.getFuel();
        this.position = memento.getPosition();
    }
}
