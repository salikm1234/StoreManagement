# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

![unit2 uml diagram](https://github.com/user-attachments/assets/ecb6ac5b-d630-447f-b607-b17330771dc3)


## Description

I created a rental store program that uses class design, **inheritance**, and object instantiation to represent different rental types: `Rental`, `Car`, `Boat`, and `Bike`. Each class is a **subclass** of `Rental`, demonstrating 
**inheritance**. The program prompts the user for input using scanner, asking for rental type, year, and category-specific preferences like whether a car is electric. This input is processed with **conditional statements** and **loops**, 
filtering and displaying the matching objects stored in array lists. The project emphasizes **constructors**, **accessor** and **mutator methods**, and **method overloading** to handle user interaction. The program uses accessor and mutator 
methods to get and set values like the year or type of rental for each object. Method overloading is used in constructors, allowing both no-argument and parameterized constructors to create objects with default or specific values. 
The constructors initialize instance variables like year, modelName, and class-specific attributes like hasMotor for Boat.
