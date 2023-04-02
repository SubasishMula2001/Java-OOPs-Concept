 // Inheritance is mechanism in which a class aquire the property and behaviour of its parent class
 
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
