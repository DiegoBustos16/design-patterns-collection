# Command Pattern

The **Command Pattern** encapsulates a request as an object, allowing me to parameterize clients with different requests, queue them, or log them. It decouples the object that invokes the operation from the one that knows how to perform it.

## When to Use

This pattern is useful when I need to:

- Parameterize objects with operations
- Queue or log operations
- Implement undo/redo functionality

## Benefits

- Decouples sender and receiver
- Allows easy command logging, undo, and scheduling
- Makes it easier to add new commands without changing existing code

## Example: Control Panel in a Race Car

In this example, I built a `RaceCarControlPanel`, representing the set of physical or digital buttons a race car driver might press (on the wheel or dashboard). Each button triggers a different command object that encapsulates a specific action on the car.

## Client Usage

```java
RaceCar car = new RaceCar();

Command start = new StartEngineCommand(car);
Command stop = new StopEngineCommand(car);

RaceCarControlPanel controlPanel = new RaceCarControlPanel();
controlPanel.setStartEngineCommand(start);
controlPanel.setStopEngineCommand(stop);

controlPanel.pressStartButton();
// Output: Race car engine started!

controlPanel.pressStopButton();
// Output: Race car engine stopped.
```