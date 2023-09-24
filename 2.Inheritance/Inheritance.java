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

 //  III.Hierarchical Inheritance : Hierarchical Inheritance occurs when multiple classes inherit from a single superclass.
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
