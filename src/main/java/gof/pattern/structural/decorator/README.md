# Decorator Pattern

The Decorator Pattern is a structural design pattern that allows you to dynamically add additional behaviors and responsibilities to objects without altering their code. It involves wrapping objects in decorator objects, which can modify the behavior and appearance of the original object.

## Purpose

The Decorator Pattern is used when you want to add or modify the functionality of objects at runtime without impacting their existing structure. It provides an alternative to subclassing for extending functionality, allowing for a more flexible and modular approach.

## Structure

- `Component`: This is the interface or abstract class that defines the base functionality for the objects that can be decorated.
- `ConcreteComponent`: This is the actual object that implements the `Component` interface.
- `Decorator`: This is the abstract class that inherits from `Component` and holds a reference to a `Component` object. It has the same interface as `Component`.
- `ConcreteDecorator`: These are the classes that extend `Decorator` to add or override specific behavior or state.

## Example

In our example scenario, we have implemented the Decorator Pattern to create a gift wrapping system. The `Gift` interface defines the base functionality, while the `SimpleGift` class is the concrete implementation. The `GiftDecorator` abstract class and its subclasses `PaperWrapper` and `RibbonDecorator` demonstrate how decorators can add new features to gifts.

## Benefits

- **Dynamic Enhancement**: Decorators allow for runtime modification of object behavior, enabling dynamic enhancement of features without altering the original classes.
- **Single Responsibility Principle**: Decorators enable you to separate concerns by having individual classes that handle specific features.
- **Easy Composition**: Decorators can be combined in various ways to build complex functionality.

## Usage

1. Define the base component interface or class with the common methods.
2. Create concrete components that implement the base component.
3. Create an abstract decorator class that inherits from the base component and contains a reference to it.
4. Create concrete decorator classes by extending the decorator and adding or modifying behavior.
5. Instantiate components and decorate them with various decorators as needed.

````
             +--------------------+
             |     Component      |
             +--------------------+
             |   operation()      |
             +--------------------+
                   ^            ^
                   |            |
                   |            |
                   |            |
  +--------------------+    +----------------+
  |  ConcreteComponent |    |    Decorator   |
  +--------------------+    +----------------+
  |   operation()      |    |   operation()  |
  +--------------------+    |  additionalOp()|
                            +----------------+
                               ^     
                               |     
                               |     
                               |     
                     +------------------+
                     | ConcreteDecorator|
                     +------------------+
                     |   operation()    |
                     |   additionalOp() |
                     +------------------+

