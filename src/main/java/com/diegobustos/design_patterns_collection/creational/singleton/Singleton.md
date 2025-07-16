# Singleton Pattern

The Singleton pattern is a design pattern that ensures a class has only one instance and provides a global point of access to it. It's commonly used for things like configuration, logging, caching, or any resource that should be shared across the system.

There are different ways to implement a singleton in Java. Below you'll find the two most common examples used in practice.

---

## 🔹 SingletonClassic

This is the eager initialization approach. The instance is created as soon as the class is loaded, which makes it simple and thread-safe, but it also means the instance is created even if it's never used.

```java
SingletonClassic singleton = SingletonClassic.getInstance();
```

---

## 🔹 SingletonAdvanced (Lazy + Thread-Safe)

This implementation uses a static inner class to achieve lazy loading and thread safety without requiring synchronization. The JVM guarantees that the inner class will only be loaded and initialized when it's actually accessed for the first time. That makes this method both efficient and safe in multi-threaded environments.

```java
SingletonAdvanced singletonAdvanced = SingletonAdvanced.getInstance();
```

The key to this approach is that the inner `SingletonHolder` class is not loaded until the `getInstance()` method is called. Since class loading is thread-safe in Java, this guarantees that only one instance is ever created, and only when needed.

