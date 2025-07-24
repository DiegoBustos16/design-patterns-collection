# Decorator Pattern

The **Decorator Pattern** allows adding new behavior to objects dynamically by wrapping them with decorator classes that implement the same interface. It provides a flexible alternative to subclassing for extending functionality.

## When to Use

This pattern is useful when I want to add features to specific objects without modifying their code or creating a large hierarchy of subclasses. It’s especially helpful when I need to combine behaviors in different ways or apply them at runtime.

## Benefits

- Adds responsibilities to objects without changing their classes.
- Promotes composition over inheritance.
- Allows for flexible and reusable code by layering decorators.

## Example: Race Car Customization

In this case, I created decorators to customize a race car by dynamically adding features like **engine** and **tires**. Each feature is implemented as a separate decorator that wraps the base car object.

## Client Usage

```java
RaceCar car = new BasicRaceCar();
car = new EngineDecorator(car);
car = new TireDecorator(car);

car.assemble();
// Output: Basic race car + Engine + Tire
```