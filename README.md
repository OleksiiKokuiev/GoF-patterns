GoF patterns, also known as Gang of Four patterns, refer to a set of design patterns introduced by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides in their book "Design Patterns: Elements of Reusable Object-Oriented Software." The book, commonly referred to as the Gang of Four (GoF) book, was published in 1994 and has had a significant impact on software design and object-oriented programming.

The GoF patterns are categorized into three groups based on their purpose:

1. Creational Patterns: These patterns focus on object creation mechanisms, providing flexibility and reusability when instantiating objects. Creational patterns include:
    - Factory Method: Creates objects through an interface, allowing the subclasses to alter the type of objects that will be created.
    - Abstract Factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
    - Singleton: Ensures that a class has only one instance and provides a global access point to this instance.
    - Prototype: Creates new objects by copying existing ones, allowing efficient object creation.

2. Structural Patterns: These patterns deal with the composition of classes and objects to form larger structures while keeping the system flexible and efficient. Structural patterns include:
    - Adapter: Converts the interface of a class into another interface clients expect, making classes with incompatible interfaces work together.
    - Bridge: Decouples an abstraction from its implementation, allowing them to vary independently.
    - Composite: Represents part-whole hierarchies of objects, allowing clients to treat individual objects and compositions uniformly.
    - Decorator: Dynamically adds responsibilities to objects, providing a flexible alternative to subclassing for extending functionality.
    - Facade: Provides a simplified interface to a complex subsystem, making it easier to use.
    - Flyweight: Shares objects to support large numbers of fine-grained objects efficiently.

3. Behavioral Patterns: These patterns focus on communication between objects, defining how they collaborate and interact with each other. Behavioral patterns include:
    - Chain of Responsibility: Enables passing requests along a chain of handlers, each handling the request or passing it to the next handler in the chain.
    - Command: Encapsulates a request as an object, allowing parameterization of clients with different requests, queuing of requests, and logging of the requests.
    - Interpreter: Provides a way to evaluate language grammar or expressions.
    - Iterator: Provides a way to access the elements of a collection without exposing its underlying representation.
    - Mediator: Reduces direct dependencies between objects by introducing a mediator object that coordinates their interactions.
    - Memento: Captures the internal state of an object without exposing its internal structure, allowing the object's state to be restored later.
    - Observer: Defines a dependency between objects so that when one object changes its state, all its dependents are notified and updated automatically.
    - State: Allows an object to change its behavior when its internal state changes.
    - Strategy: Defines a family of algorithms, encapsulating each one and making them interchangeable.
    - Template Method: Defines the skeleton of an algorithm, allowing subclasses to redefine certain steps without changing the overall structure.
    - Visitor: Separates an algorithm from the object structure on which it operates, allowing new operations to be added without modifying the objects.

The GoF patterns provide reusable solutions to common design problems in object-oriented software development. They have become a standard reference for software designers and developers and are widely used in various programming languages to create flexible, maintainable, and extensible software systems.