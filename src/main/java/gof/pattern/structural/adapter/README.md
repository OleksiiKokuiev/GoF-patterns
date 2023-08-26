## Adapter Pattern

The Adapter pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between two interfaces, converting the interface of one class into another interface that clients expect.

## Benefits of Adapter Pattern

- Allows integration of new and old components without modifying existing code.
- Provides flexibility by allowing different interfaces to work together.
- Improves re-usability of existing classes.

## Usage

1. Create an instance of `LegacyLibrary` (the existing class).
2. Create an instance of `LegacyAdapter` by passing the `LegacyLibrary` instance.
3. Use the `LegacyAdapter` to perform actions through the `TargetInterface`.

### Example Description

In this example:
- `LegacyLibrary` represents an existing class with a legacy interface.
- `TargetInterface` is the desired interface that clients expect.
- `LegacyAdapter` adapts the `LegacyLibrary` to the `TargetInterface`.
- `Client` utilizes the `TargetInterface` to perform actions.

````
       +------------------------+
       |      LegacyLibrary     |
       +------------------------+
       | - doLegacyAction()     |
       +------------------------+
                |
                |
                v
       +------------------------+
       |    TargetInterface     |
       +------------------------+
       | - doNewAction()        |
       +------------------------+
                ^
                |
        +------------------+
        |  LegacyAdapter   |
        +------------------+
        | - legacyLibrary  |
        | + doNewAction()  |
        +------------------+
                |
                |
                v
       +------------------------+
       |        Client          |
       +------------------------+
       | - performAction()      |
       +------------------------+
