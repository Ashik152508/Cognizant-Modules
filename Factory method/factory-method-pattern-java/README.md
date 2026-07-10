# Factory Method Pattern - Java Implementation

## Overview
This project demonstrates the **Factory Method Pattern**, a creational design pattern that provides an interface for creating objects without specifying their exact classes.

## Pattern Components

### 1. **Shape.java** (Product Interface)
- Defines the interface that all concrete products must implement
- Contains the `draw()` method

### 2. **Circle.java** (Concrete Product)
- Implements the `Shape` interface
- Provides concrete implementation of `draw()` method

### 3. **Rectangle.java** (Concrete Product)
- Implements the `Shape` interface
- Provides concrete implementation of `draw()` method

### 4. **ShapeFactory.java** (Factory Class)
- Contains the static factory method `createShape(String shapeType)`
- Creates and returns appropriate Shape objects based on the input type
- Encapsulates object creation logic

### 5. **Main.java**
- Demonstrates how to use the factory to create objects
- Shows the benefits of the factory pattern


## How to Run

1. Compile all Java files:
```bash
javac src/*.java
```

2. Run the Main class:
```bash
java -cp src Main
```

## Expected Output
```
Drawing Circle
Drawing Rectangle
Drawing Circle
```

## When to Use Factory Method Pattern

- When a class cannot anticipate the type of objects it needs to create
- When you want to centralize object creation logic
- When you need flexibility in which objects get created
- When adding new object types shouldn't affect existing code
