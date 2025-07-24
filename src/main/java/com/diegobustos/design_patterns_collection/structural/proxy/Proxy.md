# Proxy Pattern

The **Proxy Pattern** provides a substitute or placeholder for another object to control access to it. It is commonly used for access control, lazy initialization, logging, and more.

## When to Use

This pattern is useful when I want to control access to an object that is resource-intensive to create or should only be accessible under certain conditions.

## Benefits

- Controls access to the real object.
- Can defer the creation of expensive objects.
- Adds a layer for additional logic like logging or security checks.

## Example: Race Car Access Control

In this case, I created a `RaceCarProxy` to control access to the `RealRaceCar`. The proxy checks if the driver has a valid racing license before allowing the car to drive.

## Client Usage

```java
RaceCar proxyWithLicense = new RaceCarProxy(true);
proxyWithLicense.drive();
// Output: Driving the real race car at full speed!

RaceCar proxyWithoutLicense = new RaceCarProxy(false);
proxyWithoutLicense.drive();
// Output: Access denied. Driver does not have a valid racing license.
```