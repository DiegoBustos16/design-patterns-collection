package com.diegobustos.design_patterns_collection.structural.adapter;

public class AspiratedEngine implements Engine{
    @Override
    public void throttle() {
        System.out.println("Throttle using carburetor throttle valve.");
    }
}
