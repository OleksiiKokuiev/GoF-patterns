## Builder Pattern

The Builder pattern is a creational design pattern that allows the construction of complex objects step by step. It separates the construction of an object from its representation, allowing the same construction process to create different representations.

### Main Components

1. **Director**: Manages the construction process and interacts with the builder to construct the final object. The director is not aware of the concrete products or their representations.

2. **Builder**: An interface that defines the steps to build parts of the complex object. It provides abstract methods for building different components of the product.

3. **Concrete Builders**: Implement the builder interface to construct and assemble the parts of the complex object. Each concrete builder can produce different representations of the product.

4. **Product**: Represents the complex object being built. The builder constructs and assembles the parts to create the final product.

### Key Advantages

- Allows the creation of complex objects with different configurations, hiding the construction details from the client code.
- Provides a clear separation between the construction and representation of objects.
- Supports the addition of new product types or changes to the construction process without affecting the client code.

### Usage

The Builder pattern is used when the algorithm for creating a complex object should be independent of the parts that make up the object and the way they are assembled. It is particularly useful when there are multiple variations of a product and the client code should be shielded from the complexity of their creation.

Please see the example code and detailed explanation of the Builder pattern in the project to understand its implementation and usage in different scenarios.

For a complete understanding of the Builder pattern and its variations, refer to the original Gang of Four book, "Design Patterns: Elements of Reusable Object-Oriented Software".

Builder Pattern Class Diagram:

```
+----------------+                  +----------------+
|    Director    |                  |     Builder    |
+----------------+                  +----------------+
| - builder      |<>--------------| + buildPartA() |
|                |                  | + buildPartB() |
+----------------+                  +----------------+
/\                                    |
|                                      |
|                                      |
|                                      |
|                                      |
|                                      |
+-----------------+                  +------------------+
| ConcreteBuilder |                  |     Product      |
+-----------------+                  +------------------+
| + buildPartA()  |                  | + partA: PartA   |
| + buildPartB()  |                  | + partB: PartB   |
| + getResult()   |<>----------------|                  |
+-----------------+                  +------------------+
|
|
|
|
|
+-----------------+
|     Client      |
+-----------------+
| - director      |
+-----------------+
```
This class diagram represents the main components of the Builder pattern:

- `Director`: Manages the construction process and works with the `Builder` interface to construct the final object.

- `Builder`: An interface that defines the methods for building different components of the complex object.

- `ConcreteBuilder`: Implements the `Builder` interface to construct and assemble the parts of the complex object.

- `Product`: Represents the complex object being built. The `ConcreteBuilder` constructs and assembles the parts to create the final product.

- `Client`: Uses the `Director` to construct a specific type of `Product` using a `ConcreteBuilder`.