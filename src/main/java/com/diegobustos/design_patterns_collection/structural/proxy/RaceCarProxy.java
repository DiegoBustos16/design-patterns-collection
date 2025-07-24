package com.diegobustos.design_patterns_collection.structural.proxy;

public class RaceCarProxy implements RaceCar {
    private RealRaceCar realCar;
    private boolean hasLicense;

    public RaceCarProxy(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    @Override
    public void drive() {
        if (hasLicense) {
            if (realCar == null) {
                realCar = new RealRaceCar();
            }
            realCar.drive();
        } else {
            System.out.println("Access denied. Driver does not have a valid racing license.");
        }
    }
}
