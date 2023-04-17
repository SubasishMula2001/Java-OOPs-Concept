// Method Overriding : -> Method overriding is when a subclass provides a specific 
// implementation of a method that is already provided by its parent class

 class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

 class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Output: The animal makes a sound
        animal2.makeSound(); // Output: Meow
    }
}
