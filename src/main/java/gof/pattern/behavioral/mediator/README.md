## Mediator Pattern

The Mediator pattern is one of the behavioral design patterns described in the book "Design Patterns: Elements of Reusable Object-Oriented Software" (GoF - Gang of Four). This pattern is used to reduce coupling between objects by allowing them to interact through a mediator.

The goal of the Mediator pattern is to create a mediator object that centralizes interactions between objects instead of them communicating directly with each other. As a result, objects are not aware of each other directly, which reduces dependencies and makes it easier to make changes to the system.

### Key Components of the Mediator Pattern:

1. **Mediator**: This is an interface or abstract class that defines methods for interacting with different components (colleagues). Usually, the Mediator contains methods for registering, notifying, and handling messages between colleagues.

2. **ConcreteMediator**: This is a concrete implementation of the Mediator interface that facilitates cooperation between colleagues.

3. **Colleague**: This is an interface or abstract class that defines methods for communicating with the Mediator.

4. **ConcreteColleague**: This is a concrete implementation of the Colleague interface and represents objects that interact with each other through the Mediator.

### When to Use the Mediator Pattern?

- When the system becomes complex with a large number of interconnected objects, and the coupling between them is too high.
- When changes in interactions between objects occur frequently, and it might be challenging to track dependencies.
- When there is a need to reuse objects and their interactions in different contexts.

### Example Use Case:

An example of the Mediator pattern could be a chat system, where different users (colleagues) communicate with each other through a server (mediator). Users are not aware of each other's existence and communicate solely with the server, which forwards messages from the sender to the recipient.

It's essential to remember that using the Mediator pattern may increase code complexity, as all communication between objects now goes through the Mediator. Therefore, it should be applied judiciously in cases where the benefits of reducing coupling outweigh its drawbacks.

---
```
+--------------+          +--------------+
|   User       |          | ChatMediator |
+--------------+          +--------------+
| sendMessage()|<>------->|sendMessage() |
+--------------+          +--------------+
     /\                            |
     |                              |
     |                              |
     |                              |
     |                              |
     |                              |
     |                              |
     |                              |
     |                              |
+--------------+          +--------------+
| ChatUser     |          |ChatMediatorImpl|
+--------------+          +--------------+
|              |          |+users         |
+--------------+          +--------------+
```
