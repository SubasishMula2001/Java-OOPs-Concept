// Method Overriding : -> Method overriding is when a subclass provides a specific 
// implementation of a method that is already provided by its parent class

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
