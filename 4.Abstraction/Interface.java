interface Animal { // by default public static final hota hai
    
  void walk(); // abstract and public 
}
interface Herbivore {
    
}
class Horse implements Animal, Herbivore {
    public void walk () {
        System.out.println("walks on 4 legs");
    }
}
public class Interface {
    public static void main(String []args) {
        Horse horse = new Horse();
        horse.walk();
      }
   }
