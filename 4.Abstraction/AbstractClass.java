// Cannot create an instance of abs class
// abstract or non-abstract methods
// can have constructors
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
