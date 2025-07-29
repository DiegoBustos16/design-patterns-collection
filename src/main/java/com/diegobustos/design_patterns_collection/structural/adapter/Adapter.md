# Adapter Pattern

The **Adapter Pattern** allows classes with incompatible interfaces to work together. It wraps an existing class with a new interface so it can be used in a system expecting a different interface.

## Structure

- **Target (AspiratedEngine):** Interface that the system expects.
- **Adaptee (HybridEngine):** Class with an incompatible interface.
- **Adapter (HybridEngineAdapter):** Translates method calls from `Engine` to `HybridEngine`.

## Example: Hybrid Engine Adapter

The racing system is built to work with engines through a common interface:

```java
interface Engine {
    void throttle();
}
```
However, now it is necessary to integrate a new HybridEngine which has separate methods for the electric and combustion motors:
```java
public class HybridEngine {
    void speedUpElectricMotor();
    void throttleCombustionEngine();
}
```
Instead of modifying the system or the hybrid engine, create an adapter that implements Engine and delegates calls to both electric and combustion methods of the HybridEngine.
## Client Code

```java
Engine standardEngine = new CombustionEngine();
standardEngine.throttle();

Engine hybridEngine = new HybridEngineAdapter(new HybridEngine());
hybridEngine.throttle();
```