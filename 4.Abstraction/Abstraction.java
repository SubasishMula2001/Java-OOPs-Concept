// This is the process of hiding the implementation details and exposing only the necessary information to the user. 
//  In Java, abstraction is achieved by using abstract classes and interfaces.
// using abstract keyword
// Cannot create an instance of abs class
// abstract or non-abstract methods
// can have constructors
// Absract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
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
// another example
 abstract class Animal {
    String color;
    Animal() {
        color = "brown";
    }
    void eat() {
      System.out.println("Animal eats");
  }
  abstract void walk(); // not obj creation
}
class Horse extends Animal {
    void changeColor() {
       color="dark brown"; 
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal {
    void changeColor() {
       color="yellow"; 
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
public class AbstractClass {
    public static void main(String args[]) {
     Horse h = new Horse();
     h.eat();
     h.walk();
     System.out.println(h.color);
     Chicken c = new Chicken();
     c.eat();
     c.walk();
    }
}
// another example
public abstract class Bank {
   String name;
   
   abstract void readData();
   abstract void writeData();
}
class Admin extends Bank {
    void readData() {
        System.out.print("This is read data by abstract")
    }
    void writeData() {
        System.out.print("This is write data by abstract ")
    }
}
class Marketing extends Bank {
    @Override
    void readData() {
        
    }
    @Override
    void writeData() {
        
    }
}

