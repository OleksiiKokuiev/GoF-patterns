# State Pattern Pattern

The State Pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes. This pattern helps an object transition between different states and ensures that the object's behavior is determined by its current state.

## Purpose

The State Pattern is used to model state-dependent behavior in a flexible and modular way. It allows an object to vary its behavior when its internal state changes, without altering its class. This pattern is particularly useful when an object can have multiple, distinct behaviors based on its current state.

## Structure

- `Context`: This is the class that contains the internal state and maintains a reference to the current state object. It delegates state-specific behavior to the current state object.
- `State`: This is the abstract base class or interface that defines the methods that encapsulate the behavior associated with a particular state.
- `ConcreteState`: Subclasses inherit from the State class and provide specific implementations for the behavior associated with a particular state.

## Example

In our example scenario, we will illustrate the State Pattern by creating a simple vending machine. The `VendingMachine` class serves as the context, and it can be in different states such as `ReadyState` (when it's ready to dispense items) and `EmptyState` (when it's out of items). Each state is represented by a concrete state class that implements the behaviors associated with that state.

## Benefits

- **Modularity**: The State Pattern promotes separation of concerns by encapsulating state-specific behavior into separate classes. This enhances code modularity and maintainability.
- **Extensibility**: Adding new states and behaviors is relatively easy, as new state classes can be introduced without modifying existing code.
- **Clean Code**: The pattern helps avoid large conditional statements that would otherwise be needed to handle different states within a single class.

## Usage

1. Define the `Context` class that maintains a reference to the current state object and delegates state-specific behavior to it.
2. Create an abstract `State` class or interface that defines the methods for different state-specific behaviors.
3. Implement concrete state classes by inheriting from the `State` class and providing specific behavior for each state.
4. Inside the `Context` class, handle state transitions by updating the current state object based on certain conditions.
5. Clients interact with the `Context` class, and the state changes are automatically reflected in the object's behavior.
````
    +----------------------+       +------------------+
    |     Context          |       |      State       |
    +----------------------+       +------------------+
    | - currentState: State|       |                  |
    | + setState(State)    |<------|   handleAction() |
    | + request()          |       |                  |
    +----------------------+       +------------------+
                 ^                        ^
                 |                        |
                 | has-a                  | is-a
                 |                        |
    +------------------+       +------------------+
    |   ConcreteState  |       |    ConcreteState |
    +------------------+       +------------------+
    |  handleAction()  |       |  handleAction()  |
    +------------------+       +------------------+
      (specific behavior)         (specific behavior)


