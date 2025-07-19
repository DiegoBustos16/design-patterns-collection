package com.diegobustos.design_patterns_collection.creational.prototype;

public class F1Car implements RacingCarPrototype {

    private int topSpeed;

    public F1Car(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    private F1Car(F1Car original) {
        this.topSpeed = original.topSpeed;
    }

    @Override
    public RacingCarPrototype cloneCar() {
        return new F1Car(this);
    }

    public void showTopSpeed() {
        System.out.println("F1 Car - Top Speed: " + topSpeed);
    }
}