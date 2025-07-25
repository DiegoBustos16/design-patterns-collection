# Observer Pattern

The **Observer Pattern** defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

## When to Use

- When multiple objects need to be in sync with another object
- When an object needs to broadcast changes to many listeners
- When I want to decouple the object emitting the changes from those consuming them

## Example: Race Car Broadcasting Updates

In this example, a race car updates its state (position and speed), and multiple observers (Tv and Radio Broadcast of the race) are notified and react in their own way.

## Client Usage

```java
RaceCar car = new RaceCar();

        RaceObserver tv = new TvTransmission();
        RaceObserver radio = new RadioTransmission();

        car.addObserver(tv);
        car.addObserver(radio);

        car.setPosition(1);
        car.setSpeed(280);

        car.setPosition(2);
        car.setSpeed(260);
```