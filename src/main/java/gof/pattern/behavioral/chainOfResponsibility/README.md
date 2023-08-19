# Chain of Responsibility Pattern

The Chain of Responsibility Pattern is a behavioral design pattern that allows a chain of objects to handle requests. Each object in the chain can either process the request or pass it along to the next object in the chain. This pattern promotes loose coupling and flexibility in handling requests.

## Purpose

The Chain of Responsibility Pattern is used when you have a series of processing objects, and you want to give more than one object the opportunity to process a request. It avoids coupling the sender of a request to its receiver, and it allows multiple objects to handle the request without knowing the exact processing sequence.

## Structure

- `Handler`: This is the interface or abstract class that defines the common method for handling requests.
- `ConcreteHandler`: These are the classes that implement the `Handler` interface and contain logic to handle specific types of requests.
- `Client`: This is the class that initiates the chain by sending requests to the first handler.

## Example

In our example scenario, we've implemented the Chain of Responsibility Pattern to demonstrate an authentication system with multiple levels of authentication handlers. The `AuthHandler` interface defines the common handling method, and concrete handlers (`UsernamePasswordAuthHandler`, `TwoFactorAuthHandler`, `GuestAuthHandler`) process the requests sequentially.

## Benefits

- **Flexibility**: The Chain of Responsibility Pattern allows dynamic reordering or adding/removing handlers without modifying client code.
- **Decoupling**: It decouples sender and receiver, allowing each handler to focus on its specific responsibility.
- **Multiple Handling Options**: It provides the flexibility to handle requests in various ways, depending on the chain configuration.

## Usage

1. Define the `Handler` interface or abstract class with the common handling method and a reference to the next handler.
2. Implement concrete handler classes that inherit from `Handler` and provide specific handling logic.
3. In the client code, create a chain by setting the successor for each handler and send the request to the first handler.

````
        +------------------+
Request |      Handler     |
-------->------------------+
        |+successor:Handler|
        | +handleRequest() |
        +------------------+
                ^
                |
                |
                |
                |
        +------------------+
Request |  ConcreteHandler1|
-------->------------------+
        | +handleRequest() |
        +------------------+
                ^
                |
                |
                |
                |
        +------------------+
Request |  ConcreteHandler2|
-------->------------------+
        | +handleRequest() |
        +------------------+
                ^
                |
                |
                |
                |
        +------------------+
Request |  ConcreteHandler3|
-------->------------------+
        | +handleRequest() |
        +------------------+
