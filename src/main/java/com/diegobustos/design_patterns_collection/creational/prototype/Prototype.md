# Prototype Pattern

The **Prototype Pattern** is a creational design pattern that lets you create new objects by copying existing ones (prototypes), instead of creating them from scratch. It’s particularly useful when object creation is expensive or when a system needs to be independent of how its objects are instantiated.

## When to Use

- When object creation is costly (e.g. due to resource-intensive setup).
- When objects are similar but not identical, and only a few values need to be changed.
- When you want to avoid building a complex hierarchy of classes just to instantiate similar objects.

## Structure

- **Prototype Interface**: defines the `clone()` method that all concrete prototypes must implement.
- **Concrete Prototype**: implements the `clone()` method to return a copy of itself.
- **Client**: uses the prototype by cloning it, instead of instantiating it directly.

## Example: Race Car Cloning

In this example, an interface called `RacingCarPrototype` is defined to declare the `cloneCar()` method. This interface acts as a contract for any type of racing car that needs to support cloning.

Then, a concrete class `F1Car` implements that interface. By implementing the `cloneCar()` method, it enables the creation of a new instance with the same configuration.

## Client Usage
```java
RacingCarPrototype prototypeCar = new F1Car(350);
RacingCarPrototype clonedCar = (F1Car) prototypeCar.clone();

prototypeCar.showTopSpeed();
clonedCar.showTopSpeed();
```