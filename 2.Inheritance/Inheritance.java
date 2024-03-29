// Inheritance is mechanism in which a class aquire the property and behaviour of its parent class
  // In Java, inheritance is achieved by using the extends keyword.
 // reusabality 
1.Single Inheritance
2.Multilevel Inheritance
3.Hierarchical Inheritance
4.Multiple Inheritance
5.Hybrid Inheritance
 //  I.Single Inheritance : Single Inheritance occurs when a class inherits from only one superclass.
  class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

 //  II.Multilevel Inheritance :  when a class inherits from a parentclass/superclass, and then another class inherits from
  // this subclass/derived class.
// One class inherits property and behavior from a parent class and the newly created sub-class becomes the base class for another new class.
  class Grandparent {
    void grandparentMethod() {
        System.out.println("Grandparent's method");
    }
}

class Parent extends Grandparent {
    void parentMethod() {
        System.out.println("Parent's method");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child's method");
    }
}

 //  III.Hierarchical Inheritance : Hierarchical Inheritance occurs when two or more classes inherit from a single superclass.
 class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Bicycle extends Vehicle {
    void pedal() {
        System.out.println("Bicycle is pedaling");
    }
}

 //  IV.Multiple Inheritance : Java does not support multiple inheritance of classes, meaning a class cannot 
 //inherit from more than one class. However, it can implement multiple interfaces.
// where a class can inherit from more than one classes called Mulitple inheritance.
 interface Swimmer {
    void swim();
}

interface Flyer {
    void fly();
}

class Bird implements Swimmer, Flyer {
    public void swim() {
        System.out.println("Bird is swimming");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

 //  V.Hybrid Inheritance : It is a mix of two or more of the above types of inheritance. 
//the hybrid inheritance is the composition of two or more types of inheritance
 //Since Java doesn’t support multiple inheritances with classes, hybrid inheritance is also not possible
// with classes. In Java, we can achieve hybrid inheritance only through Interfaces.
 class A {
    void methodA() {
        System.out.println("Class A method");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Class B method");
    }
}

class C extends B {
    void methodC() {
        System.out.println("Class C method");
    }
}

interface X {
    void methodX();
}

class D extends C implements X {
    void methodD() {
        System.out.println("Class D method");
    }

    public void methodX() {
        System.out.println("Interface X method");
    }
}
//Why multiple inheritance is not supported in java?
// to prevent ambiguity.
//To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
// another example

 class Animal {
    public void eat() {
        System.out.println("Animal is eatingi");
    }
}
public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
    public static void main(String args[] ) {
        Dog obj = new Dog();
        obj.bark();
        obj.eat();
    }
}
//In this example, the Dog class extends the Animal class and inherits its eat() method.
// Diamond Problem:
//   It refers to a situation where a class inherits from two or more classes that have a common base class. 
// This can lead to ambiguity in the inheritance hierarchy 
class A  
{  
public void display()  
{  
System.out.println("class A display() method called");  
}  
}  
class B extends A  
{  
@Override  
public void display()  
{  
System.out.println("class B display() method called");  
}  
}  
class C extends A  
{  
@Override  
public void display()  
{  
System.out.println("class C display() method called");  
}  
}  
//not supported in Java  
public class D extends B,C  
{  
public static void main(String args[])  
{  
D d = new D();  
//creates ambiguity which display() method to call  
d.display();   
}  
}  //compiler error

// Advantages of Inheritance in Java:

// Code Reusability: Inheritance promotes code reuse by allowing you to define a new class based on an existing class.
//   This reduces code duplication and makes it easier to maintain and extend your codebase.
  
// Method Overriding: Inheritance allows you to override methods from the parent class in the child class, providing
//   specialized implementations. This is a key feature of polymorphism and is used for achieving runtime polymorphism.

// Disadvantages of Inheritance
// No Independence: One of the main disadvantages of Inheritance in Java is that two classes, both the base and inherited
//   class, get tightly bounded by each other. In simple terms, Programmers can not use these classes independently of each other.

// Decreases Execution Speed: Another con of Inheritance is that it decreases the execution speed because Inheritance execution
//   takes time and effort.

// Refactoring the Code: If the user deletes the Super Class, then they have to refactor it if they have used it.
