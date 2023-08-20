# Command Pattern

The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object, encapsulating all the information about the request. This allows for parameterizing objects with different requests, queuing requests, and logging requests.

## Purpose

The Command Pattern is used to decouple the sender and receiver of a command by encapsulating the request as an object. It allows for the parameterization of clients with different requests and supports undoable operations and logging.

## Structure

- `Command`: This is the interface that declares the `execute()` method.
- `ConcreteCommand`: These are the classes that implement the `Command` interface, encapsulating a specific request and binding it to the receiver.
- `Receiver`: This is the class that performs the actual action when the `execute()` method of the command is called.
- `Invoker`: This is the class that holds the command and triggers the `execute()` method when needed.

## Example

In our example scenario, we've implemented the Command Pattern to showcase a remote control for turning lights on and off. The `Light` class acts as the receiver, and the `LightOnCommand` and `LightOffCommand` classes encapsulate the commands for turning the light on and off. The `RemoteControl` acts as the invoker that triggers the commands.

## Benefits

- **Decoupling**: The Command Pattern separates the sender and receiver, reducing dependencies between them.
- **Flexibility**: Clients can be parameterized with different commands, enabling dynamic changes in behavior.
- **Undo/Redo**: The pattern provides a natural way to implement undoable operations by storing command history.
- **Logging**: Commands can be logged and executed at a later time.

## Usage

1. Define the `Command` interface with the `execute()` method.
2. Implement concrete command classes that encapsulate specific requests.
3. Define receiver classes that perform the actual actions.
4. Implement the invoker class that holds and triggers commands.
5. Clients can create and set commands for invokers to execute.

## Example Code

```
      Client             Invoker
        |                   |
        v                   v
+-------------------+  +-------------------+
|    Command        |  |     Invoker       |
+-------------------+  +-------------------+
| +execute()        |  | +setCommand()    |
+-------------------+  | +invoke()         |
        ^             +-------------------+
        |                      ^
        |                      |
        |                      |
        |                      |
        |                      |
+-------------------+  +-------------------+
| ConcreteCommand   |  |    Command        |
+-------------------+  +-------------------+
| -receiver: Light  |  | +execute()        |
+-------------------+  +-------------------+
| +execute()        |
+-------------------+
        ^
        |
        |
        |
+-------------------+
|       Light       |
+-------------------+
| +turnOn()         |
| +turnOff()        |
+-------------------+

