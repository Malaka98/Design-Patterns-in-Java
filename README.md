# Design-Patterns-in-Java
Design Patterns, as the name says, are patterns used to describe objects and classes that relate to each other to solve a generic design problem in a particular context. That is why so many of them exists, and in this repository you will see examples in Java and quick explanations about some patterns and when you neet to use them. Feel free to contribute with more patterns. If you want to know more about Design Patterns, you can check the <a href="https://refactoring.guru/design-patterns"> Refactoring Guru website </a> about this!

## Command Pattern
This pattern turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

## Decorator Pattern

This patterns represents an alternative to inheritance when you need to add new functionality to a base class. Instead of using inheritance, composition is used to add such functionality dynamically to base classes. 

## Facade Pattern

The Facade design pattern is a class that provides a simpler interface to a system. The goal is to avoid users having to know the internal classes of this system; instead, they only need to interact with the Facade class. The inner classes are encapsulated behind this Facade.

## Observer Pattern
The Observer pattern defines how to implement a one-to-many relationship between subject objects and observers. When a subject's state changes, its observers must be notified.

## Proxy Pattern
The Proxy design pattern advocates the insertion of an intermediate object, called a proxy, between a base object and its clients. Thus, clients will no longer have a direct reference to the base object, but to the proxy. In turn, the proxy has a reference to the base object. Also, the proxy must implement the same interfaces as the base object. The purpose of a proxy is to mediate access to a base object, adding functionality to it, without it being aware of it.

## Builder Pattern
Builder is a design pattern that makes it easy to instantiate objects that have many attributes, some of which are optional. If the value of these optional attributes is not given, they must be initialized with a default value. Instead of creating several constructor methods, one method for each possible combination of parameters, we can delegate the process of initializing an object's fields to a Builder class.
