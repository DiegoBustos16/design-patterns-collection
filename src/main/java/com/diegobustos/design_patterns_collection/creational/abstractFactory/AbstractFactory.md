# Abstract Factory Pattern

The **Abstract Factory Pattern** is a creational design pattern used to define families of related or dependent objects without specifying their concrete classes. This pattern is ideal when the system needs to remain independent from how its objects are created, composed, and represented.

## When to Use

- When the system should be independent of how products are created.
- When enforcing consistency among products from the same family is important.
- When multiple families of products are needed and interchangeable.

## Structure

- **AbstractProductA** / **AbstractProductB**: Interfaces for a family of products.
- **ConcreteProductA1**, **ConcreteProductA2**: Specific implementations of each product.
- **AbstractFactory**: Declares creation methods for the product families.
- **ConcreteFactory1**, **ConcreteFactory2**: Implement the creation of the specific product families.
- **Client**: Uses only the interfaces exposed by the `AbstractFactory` and `AbstractProducts`.

## Example: Racing Team Factory

In the example, two related types of objects are created:
- A `RacingCar`
- An `Engine`

Each racing category (e.g., F1, NASCAR, Indy) has its own version of car and engine. A separate factory is created for each team (like `F1TeamFactory`) that knows how to produce both the car and the engine.

## Purpose of This Approach

- Ensures that the car and engine created belong to the same family and are compatible.
- Isolates the object creation logic from the client code.
- Allows easy substitution of one racing team for another without modifying the client logic.

## Usage in Client Code

```java
RacingTeamFactory factory = new F1TeamFactory();

RacingCar car = factory.createCar();
Engine engine = factory.createEngine();

car.topSpeed();
engine.engineSpecs();
```

This setup guarantees that the client receives a consistent and compatible set of objects — for example, an F1 car and its corresponding engine — without knowing or depending on their concrete classes.
