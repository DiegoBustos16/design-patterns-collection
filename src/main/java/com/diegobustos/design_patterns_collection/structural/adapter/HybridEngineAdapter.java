package com.diegobustos.design_patterns_collection.structural.adapter;

public class HybridEngineAdapter implements Engine {

    private final HybridEngine hybridEngine;

    public HybridEngineAdapter(HybridEngine hybridEngine) {
        this.hybridEngine = hybridEngine;
    }

    @Override
    public void throttle() {
        hybridEngine.throttleCombustionEngine();
        hybridEngine.speedUpElectricMotor();
    }
}
