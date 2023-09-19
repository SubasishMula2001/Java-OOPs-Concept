// This is the process of hiding the implementation details and exposing only the necessary information to the user. 
//  In Java, abstraction is achieved by using abstract classes and interfaces.
// using abstract keyword
// Cannot create an instance of abs class
// abstract or non-abstract methods
// can have constructors
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
// example 2
abstract class Bank{
    abstract void sbi();
    abstract void pnb();
}
public class Loan extends Bank{
    public void sbi() {
        System.out.println("SBI loan");
    }
    public void pnb() {
        System.out.println("PNB loan");
    }
    public static void main(String []args) {
        Loan l = new Loan();
        l.sbi();
        l.pnb();
    }
}
