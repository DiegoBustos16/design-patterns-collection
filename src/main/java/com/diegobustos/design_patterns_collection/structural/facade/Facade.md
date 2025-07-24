# Facade Pattern

The **Facade Pattern** provides a simple interface to a set of complex subsystems. It helps isolate the client from the internal structure and behavior of these components.

## When to Use

This pattern is useful when I need to simplify interactions with a system composed of multiple subsystems. Instead of dealing with each service separately, I can create a facade that exposes a single method for the task I want to perform.

## Benefits

- Reduces coupling between the client and complex subsystems.
- Makes the code easier to read and maintain.
- Groups common operations under a single interface.

## Example: Race Car Preparaion

In this case, I created a ```RacePreparationFacade``` that encapsulates all the operations needed to get a race car ready: setting up tires, loading fuel, and calibrating telemetry. The client does not need to know how each subsystem works.
## Client Usage
```java
RacePreparationFacade racePreparation = new RacePreparationFacade();
racePreparation.prepareCarForRace();
```