# Observer Pattern

The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects, so that when one object changes its state, all its dependents (observers) are notified and updated automatically. This pattern promotes loose coupling between objects, enabling a change in one object to trigger cascading updates across multiple objects.

## Purpose

The Observer Pattern is used when there is a need to establish a communication channel between one object (subject) and multiple other objects (observers) without tight coupling. It's suitable for scenarios where an object's state change should propagate to other objects with minimal or no manual intervention.

## Structure

- `Subject`: This is the interface or abstract class that defines methods for adding, removing, and notifying observers.
- `ConcreteSubject`: This class implements the `Subject` interface and maintains a list of its observers.
- `Observer`: This is the interface that observers implement to receive updates from the subject.
- `ConcreteObserver`: These are the classes that implement the `Observer` interface and receive notifications from the subject.

## Example

In our example scenario, we've implemented the Observer Pattern to showcase a weather monitoring system. The `WeatherStation` acts as the subject that maintains a list of observers (`WeatherDisplay`, `PhoneApp`). Observers are notified automatically when the weather changes.

## Benefits

- **Decoupling**: The Observer Pattern decouples subject and observers, allowing them to evolve independently.
- **Flexibility**: Observers can be added or removed without affecting other parts of the system.
- **Event Handling**: It provides a robust mechanism for event handling and communication.

## Usage

1. Define the `Subject` interface or class with methods to manage observers (`addObserver`, `removeObserver`, `notifyObservers`).
2. Implement concrete `Subject` classes that maintain a list of observers and handle notifications.
3. Define the `Observer` interface or class with a method to receive updates.
4. Implement concrete `Observer` classes that react to updates from the subject.
5. In the client code, create subjects and observers, add observers to subjects, and let the subjects notify observers on state changes.

````
              +------------------+
      notify  |      Subject     |
   +--------->+------------------+
   |          | +attach(Observer)|
   |          | +detach(Observer)|
   |          | +notifyObservers()|
   |          +------------------+
   |                  ^    ^
   |                  |    |
   |                  |    |
   |                  |    |
   |                  |    |
   |          +------------------+
   |          | ConcreteSubject  |
   |          +------------------+
   |          | -observers:List  |
   +--------->| +attach(Observer)|
   |          | +detach(Observer)|
   |          | +notifyObservers()|
   |          +------------------+
   |                  ^    ^
   |                  |    |
   |                  |    |
   |                  |    |
   |                  |    |
   |    update        |    | update
   +------------------+    +---------------+
                      |                    |
                      v                    v
              +------------------+   +------------------+
              |     Observer     |   |    Observer      |
              +------------------+   +------------------+
              | +update()        |   | +update()        |
              +------------------+   +------------------+

