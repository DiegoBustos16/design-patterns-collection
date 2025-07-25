package com.diegobustos.design_patterns_collection.behavioral.observer;

public class RadioTransmission implements RaceObserver {
    @Override
    public void update(RaceCar car) {
        System.out.println("[RadioBroadcast] Car position " + car.getPosition() + ", speed " + car.getSpeed() + " km/h.");
    }
}
