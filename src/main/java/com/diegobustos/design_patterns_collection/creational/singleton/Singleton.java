package com.diegobustos.design_patterns_collection.creational.singleton;

public class Singleton {
    // Unique instance, created when the class is loaded
    private static final Singleton instance = new Singleton();

    // Private constructor to prevent external instantiation
    private Singleton() {}

    // Global method to access the instance
    public static Singleton getInstance() {
        return instance;
    }
}
