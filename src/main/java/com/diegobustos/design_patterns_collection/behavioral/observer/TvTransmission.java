package com.diegobustos.design_patterns_collection.behavioral.observer;

public class TvTransmission implements RaceObserver {
    @Override
    public void update(RaceCar car) {
        System.out.println("[Tv Broadcast] Car in position " + car.getPosition() + ", speed: " + car.getSpeed() + " km/h.");
    }
}
