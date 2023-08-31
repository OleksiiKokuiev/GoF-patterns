# Flyweight Design Pattern

The Flyweight design pattern is a structural pattern that aims to optimize memory usage by sharing common parts of object states among multiple objects. It is useful when you need to create a large number of objects with similar properties to conserve resources.

## Structure

The main components of the Flyweight pattern are:

- **Flyweight**: This is the interface or abstract class for the flyweight objects. It declares methods that flyweights should implement.
- **ConcreteFlyweight**: These are the concrete implementations of the flyweight interface. They store intrinsic (shared) state, which is common among multiple objects.
- **FlyweightFactory**: This is the factory class that manages and creates flyweight objects. It ensures that flyweights are shared and reused effectively.
- **Client**: This uses flyweight objects and may store extrinsic (unique) state that is not shared.

## Benefits

Using the Flyweight design pattern offers several benefits:

- **Reduced Memory Usage**: The pattern reduces memory consumption by sharing common state among multiple objects.
- **Improved Performance**: Reusing shared flyweight objects reduces object creation and destruction overhead.
- **Simplified Code**: The pattern separates intrinsic and extrinsic states, making code cleaner and more maintainable.
- **Scalability**: It's ideal for scenarios where a large number of objects need to be managed efficiently.

## Usage

The Flyweight pattern is used when you want to:

- Create many similar objects and conserve memory resources.
- Extract and share common state among multiple objects.
- Improve performance by reusing shared flyweights.

````
    +------------------+      +------------------+
    |     Flyweight    |<-----| ConcreteFlyweight|
    +------------------+      +------------------+
    |                  |      | - intrinsicState |
    | + operation()    |      +------------------+
    +------------------+
         ^       ^
         |       |
    +------------------+
    | FlyweightFactory |
    +------------------+
    | - flyweights: Map|
    +------------------+
    | + getFlyweight() |
    +------------------+
    
           ^
           |
    +------------------+
    |      Client      |
    +------------------+
    |                  |
    | + run()          |
    +------------------+

