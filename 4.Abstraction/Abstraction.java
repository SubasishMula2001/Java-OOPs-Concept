// using abstract keyword
abstract class Animal { // object cannot be created 
    abstract void walk();
 Animal () {
     System.out.println("Creating a new Animal");
 }
    public void eats() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse () {
        System.out.println("Create a new horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal {
     public void walk () {
         System.out.println("Walks on 2 legs");
     }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();
    }
}
