# Template Method Pattern

The Template Method Pattern is a behavioral design pattern that defines the structure of an algorithm in a base class, allowing subclasses to provide specific implementations for certain steps while keeping the overall algorithm intact.

## Purpose

The Template Method Pattern is used to create a reusable template for an algorithm while allowing specific steps of the algorithm to be customized by subclasses. This pattern helps avoid code duplication by encapsulating the common algorithm structure in the base class and promoting the reusability of the code.

## Structure

- `AbstractClass`: This is the abstract base class that defines the template method. It includes abstract and concrete methods that constitute the steps of the algorithm.
- `ConcreteClass`: Subclasses inherit from the abstract base class and provide concrete implementations for the abstract methods. These implementations define the specific behavior for the individual steps.

## Example

In our example scenario, we have implemented the Template Method Pattern to simulate the process of preparing different beverages in a cafe. The `BeverageMaker` class defines the template method `prepareBeverage()`, while subclasses `TeaMaker` and `CoffeeMaker` provide specific implementations for brewing, adding condiments, and other steps.

## Benefits

- **Code Reusability**: The common algorithm structure is encapsulated in the base class, reducing code duplication and promoting reusability.
- **Flexibility**: Subclasses can provide custom implementations for specific steps, allowing for variations in the algorithm without affecting the overall structure.
- **Maintenance**: Changes to the algorithm can be made in one place (the base class), which is then automatically reflected in all subclasses.

## Usage

1. Define the base class that includes the template method and abstract methods for the algorithm steps.
2. Create subclasses that inherit from the base class and implement the abstract methods to customize the algorithm's behavior.
3. Call the template method on the subclass instances to execute the algorithm with the defined structure and customized steps.
````
    +-----------------------+
    |   AbstractClass       |
    +-----------------------+
    | templateMethod()      |
    | step1()               |
    | step2()               |
    | step3()               |
    +-----------------------+
          ^             ^
          |             |
          |             |
          |             |
+-----------------+  +----------------+
|  ConcreteClass1 |  | ConcreteClass2 |
+-----------------+  +----------------+
|   step1()       |  | step1()        |
|   step2()       |  | step2()        |
|   step3()       |  | step3()        |
+-----------------+  +----------------+

