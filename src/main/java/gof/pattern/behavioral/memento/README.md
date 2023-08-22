# Memento Design Pattern

The Memento design pattern is a behavioral pattern that allows an object's state to be saved and restored without exposing its internal structure. This pattern is useful when you need to capture the current state of an object and later restore it to that state.

## How it works

The pattern involves three main components:

1. **Originator**: This is the object whose state needs to be saved. It provides methods to set and get the state, as well as methods to create and restore mementos.

2. **Memento**: This is an object that holds the state of the Originator at a specific point in time. It only allows the Originator to access the state, ensuring encapsulation.

3. **Caretaker**: This is responsible for storing and managing the mementos. It provides methods to save and retrieve mementos.

## When to use the Memento pattern

Use the Memento pattern when:

- You want to capture and restore an object's state without exposing its internals.
- You need to maintain a history of an object's state changes for possible undo/redo functionality.
- You want to ensure that the object's state remains unchanged while saving and restoring.

## Example

Suppose you have a text editor application, and you want to implement an undo feature that allows users to revert to previous states of their text. You can use the Memento pattern to store the text editor's state at various points in time and then restore it when needed.

## Pros and Cons

### Pros

- Provides a way to implement undo and redo functionality.
- Encapsulates the object's state, preventing direct access by other objects.
- Keeps the object's state history separate from the object itself.

### Cons

- Can lead to increased memory usage if the state history is extensive.
- In more complex scenarios, managing mementos and their storage can become complicated.

## Usage

The Memento pattern is suitable when you need to manage and restore an object's state history. It can be particularly useful in applications where maintaining a history of changes is important, such as text editors, drawing programs, and version control systems.
```
    +----------------------------------------+
    |   Originator                           |
    +----------------------------------------+
    | - state: String                        |
    +----------------------------------------+
    | + setState(state: String)              |
    | + saveToMemento(): Memento             |
    | + restoreFromMemento(memento: Memento) |
    | + getState(): String                   |
    +----------------------------------------+
         |
         v
    +----------------------+
    |   Memento            |
    +----------------------+
    | - state: String      |
    +----------------------+
    | + getState(): String |
    +----------------------+
         |
         v
    +-----------------------------------+
    |    Caretaker                      |
    +-----------------------------------+
    | - mementoList: List<Memento>      |
    +-----------------------------------+
    | + addMemento(memento: Memento)    |
    | + getMemento(index: int): Memento |
    +-----------------------------------+

