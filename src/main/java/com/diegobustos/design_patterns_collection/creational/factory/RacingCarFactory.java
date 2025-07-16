package com.diegobustos.design_patterns_collection.creational.factory;

public class RacingCarFactory {
    // Factory method that creates RacingCar instances based on a type string
    public static RacingCar createCar(String type) {
        return switch (type.toLowerCase()) {
            case "f1" -> new F1Car();           // Creates an F1 car
            case "nascar" -> new NascarCar();   // Creates a NASCAR car
            case "indy" -> new IndyCar();       // Creates an IndyCar
            default -> throw new IllegalArgumentException("Unknown racing car type: " + type);
        };
    }
}
