# Factory Pattern

The **Factory Pattern** is a creational design pattern that provides a way to create objects without specifying the exact class of object that will be created.

Instead of calling a constructor directly, client code uses a factory method. This decouples the creation process from the concrete implementation, making the code more maintainable and extensible.

---

## Benefits

- ✅ Centralizes object creation logic
- ✅ Follows the Open/Closed Principle (easily extendable)
- ✅ Reduces dependency on specific classes
- ✅ Promotes consistency and flexibility

---

## Example: Racing Car Factory 🏎️

I created a `RacingCar` interface with a method `topSpeed()` representing the top speed of the car.

Three concrete implementations were defined:

- `F1Car` (~360 km/h)
- `NascarCar` (~320 km/h)
- `IndyCar` (~380 km/h)

To avoid directly instantiating these in the client code, I implemented a single factory: `RacingCarFactory`.

### Factory Logic

```java
public class RacingCarFactory {
    public static RacingCar createCar(String type) {
        return switch (type.toLowerCase()) {
            case "f1" -> new F1Car();
            case "nascar" -> new NascarCar();
            case "indy" -> new IndyCar();
            default -> throw new IllegalArgumentException("Unknown car type: " + type);
        };
    }
}
```

### Client Usage

```java
RacingCar car = RacingCarFactory.createCar("f1");
System.out.println("Top speed: " + car.topSpeed() + " km/h");
```

This way, the client code is completely decoupled from the specific car classes.


