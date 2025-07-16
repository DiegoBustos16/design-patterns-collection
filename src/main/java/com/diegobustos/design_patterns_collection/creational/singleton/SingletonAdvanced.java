package com.diegobustos.design_patterns_collection.creational.singleton;

public class SingletonAdvanced {
    // Private constructor prevents instantiation from other classes
    private SingletonAdvanced() {}

    // Inner static helper class responsible for holding the Singleton instance
    // This class is not loaded into memory until someone calls getInstance()
    private static class SingletonHolder {
        private static final SingletonAdvanced INSTANCE = new SingletonAdvanced();
    }

    // Global access point to get the singleton instance
    // When this method is called for the first time, SingletonHolder is loaded and INSTANCE is created
    public static SingletonAdvanced getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
