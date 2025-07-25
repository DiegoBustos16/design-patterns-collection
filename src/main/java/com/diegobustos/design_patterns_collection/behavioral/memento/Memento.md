# Memento Pattern

The **Memento Pattern** captures and stores the internal state of an object without violating its encapsulation, so it can be restored later.

## When to Use

- When I want to implement undo/redo features
- To maintain history of state changes
- When I need to rollback to a previous state safely

## Example: Race Car State Management

In this example, I simulate a race car whose state (speed, fuel, position) can be saved and restored. A `RaceEngineer` acts as the caretaker, managing the history of saved states.

## Client Usage

```java
RaceCar car = new RaceCar();
RaceEngineer engineer = new RaceEngineer();

car.setSpeed(200);
car.setFuel(80);
car.setPosition(1);
car.showStatus();

engineer.saveCheckpoint(car); // Save current state

car.setSpeed(100);
car.setFuel(30);
car.setPosition(5);
car.showStatus(); // Updated state

engineer.restoreLastCheckpoint(car);
car.showStatus(); // Original state restored
```
