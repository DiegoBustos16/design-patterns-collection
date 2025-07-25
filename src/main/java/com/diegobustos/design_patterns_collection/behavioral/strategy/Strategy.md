# Strategy Pattern

The **Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from clients that use it.

## When to Use

- When you have multiple ways of doing something (like calculating, sorting, or in this case, overtaking)
- When you want to avoid `if-else` or `switch` blocks for logic that can change dynamically
- When you want to allow the behavior of a class to be set at runtime

## Example: Overtaking Strategies

Different ways a race car can overtake:
- Speed-based
- DRS-based
- Pit Stop-based

## Client Code
```java
        RaceCar car = new RaceCar(new SpeedOvertaking());
        car.tryToOvertake();

        car.setOvertakingStrategy(new DrsOvertaking());
        car.tryToOvertake();

        car.setOvertakingStrategy(new UndercutOvertaking());
        car.tryToOvertake();
```