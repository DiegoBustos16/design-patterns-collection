package com.diegobustos.design_patterns_collection.structural.adapter;

public class HybridEngine {

    public void speedUpElectricMotor() {
        System.out.println("Accelerate electric motor using PWM.");
    }

    public void throttleCombustionEngine() {
        System.out.println("Throttle injection engine by adjusting fuel map in ECU");
    }
}
