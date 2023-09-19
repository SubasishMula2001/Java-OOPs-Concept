// Method Overriding : -> Method overriding is when a subclass provides a specific 
// implementation of a method that is already provided by its parent class
//Runtime polymorphism
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Cat();
        Animal animal3 = new Dog();

        animal1.makeSound(); // Output: The animal makes a sound
        animal2.makeSound(); // Output: Meow
        animal3.makeSound(); // Output: Woof
    }
}
// another example
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
public class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
    public static void main(String[] args) {
        Square obj = new Square();
        obj.draw();
    }
}
// This is an example of runtime polymorphism or method overriding.
