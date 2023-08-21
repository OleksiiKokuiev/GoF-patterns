# Iterator Pattern

The Iterator pattern is a behavioral design pattern that provides a way to access elements of a collection sequentially without exposing its underlying structure. It allows you to traverse the elements of a collection one by one without needing to know how the collection is implemented.

## Benefits of Iterator Pattern

- Separates the logic of accessing elements from the collection's implementation.
- Simplifies client code by providing a consistent interface for iterating various collections.
- Supports multiple simultaneous iterations over the same collection.

### Key Components of the Iterator Pattern:

1. **Iterable Interface**: Represents a collection that can be iterated.
2. **Iterator Interface**: Defines methods for traversing elements in a collection.
3. **Concrete Iterator**: Implements the iterator interface and manages the iteration process.
4. **Concrete Collection**: Implements the iterable interface and provides a way to create iterators.
5. **Client**: Utilizes the iterator to traverse the collection's elements.

### When to Use the Iterator Pattern?

Use the Iterator pattern when:
- You want to provide a way to access elements of a collection without exposing its internal structure.
- You want to support multiple types of collections with a consistent iteration interface.
- You want to simplify client code that iterates over different collections.

### Example Use Case:

Imagine a music playlist containing various songs. The Iterator pattern can be used to iterate through the playlist's songs without exposing how the playlist is implemented. This allows easy traversal of songs regardless of the playlist's internal organization.

## Example Description

In this example:
- `Item` represents an item that can be iterated over.
- `ItemIterator` implements the iterator for `Item` objects.
- `IteratorPatternExample` showcases the usage of the Iterator pattern.

### Usage

1. Create an array of `Item` objects.
2. Create an instance of `ItemIterator` by passing the array.
3. Use the iterator to loop through the items and perform desired operations.

````
Iterator Pattern Structure:

   +------------------+
   |   Iterable       |       +------------------+
   +------------------+       |   Iterator       |
   | +iterator()      |<>---->| +hasNext()       |
   +------------------+       | +next()          |
        /\                    +------------------+
         |                      /\
         |                      |
         |implements            |implements
         |                      |
         |                      |
 +------------------+    +------------------+
 |ConcreteCollection|    | ConcreteIterator |
 +------------------+    +------------------+
 | +iterator()      |    | +hasNext()       |
 +------------------+    | +next()          |
                         +------------------+



