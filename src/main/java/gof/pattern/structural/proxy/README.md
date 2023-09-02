# Proxy Pattern

The Proxy Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it. In simpler terms, it allows you to create a substitute or intermediary for an object, enabling you to add extra functionality, control access, or delay object creation until it's actually needed.

## Introduction

The Proxy Pattern allows you to create a "proxy" object that stands in for another object. This proxy can perform various tasks such as lazy initialization, access control, logging, and more, while keeping the actual object hidden from the client.

## Structure

The Proxy Pattern typically consists of the following components:

- **Subject (Image)**: This is the common interface or abstract class that both the RealSubject and Proxy implement. It defines the methods that the client can use.

- **RealSubject (RealImage)**: This is the real object that the Proxy represents. It implements the Subject interface and provides the actual functionality.

- **Proxy (ProxyImage)**: This is the proxy object that acts as a middleman between the client and the RealSubject. It also implements the Subject interface and delegates requests to the RealSubject as needed. The Proxy can add additional behavior, such as lazy loading or access control.


## Benefits

- Provides a level of indirection for controlling access to objects.
- Enables lazy initialization and on-demand object creation.
- Adds functionality or behavior to objects transparently.
- Enhances security and access control.
- Supports remote and distributed systems.


``````
         +-----------------+
         |    Client       |
         +-----------------+
               |
               |
               |
         +-----------------+
         |     Subject     |
         +-----------------+
               |
         ______|_______
        |              |
        |              |
+---------------+ +---------------+
|  RealSubject  | |    Proxy      |
+---------------+ +---------------+
| - operation() | | - operation() |
+---------------+ +---------------+
