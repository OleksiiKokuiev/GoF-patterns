# Bridge Pattern

The Bridge Pattern is a structural design pattern that separates an object's abstraction from its implementation, allowing them to vary independently. This pattern is particularly useful when you need to avoid a permanent binding between an abstraction and its implementation.

## Structure

- **Abstraction**: Defines the abstraction's interface and maintains a reference to an object of type `Implementor`.
- **RefinedAbstraction**: Extends the abstraction and adds extra functionality.
- **Implementor**: Defines the interface for the implementation objects.
- **ConcreteImplementorA, ConcreteImplementorB**: Provide concrete implementations for the `Implementor` interface.

## Benefits

- Separates abstraction from implementation.
- Allows both to evolve independently.
- Enhances code maintainability and flexibility.
- Supports large class hierarchies with multiple implementations.

## Usage

1. Define the abstraction interface and maintain a reference to an `Implementor` object.
2. Create concrete implementations of the `Implementor` interface.
3. Extend the abstraction to add extra functionality in the `RefinedAbstraction` class.
4. In client code, set the desired `Implementor` for the abstraction.

## Real-world Use Case

The Bridge Pattern is used in various software systems, such as GUI libraries (separating windowing systems from the user interface) and device drivers (separating hardware specifics from the operating system).

## Example

In our example, we have two sets of interfaces: one for various functionalities (e.g., turning on/off, volume control) and the other for devices (e.g., TV, Radio). The Bridge Pattern allows us to separate these sets, enabling devices to use different functionalities independently.

````
        +-----------------+        +------------------+
        |   Abstraction   |        |   Implementor   |
        +-----------------+        +------------------+
        | - implementor   | <----> | - operationImpl()|
        |                 |        |                  |
        +-----------------+        +------------------+
              ^    |                      ^    |
              |    |                      |    |
              |    v                      |    v
  +-------------------+             +---------------------+
  | RefinedAbstraction|             | ConcreteImplementorA|
  +-------------------+             +---------------------+
  | - operation()     |             | - operationImpl()   |
  |                   |             +---------------------+
  +-------------------+             +---------------------+
                                    | ConcreteImplementorB|
                                    +---------------------+
                                    | - operationImpl()   |
                                    +---------------------+


