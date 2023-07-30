// class --> blueprints
// interface is a blueprints of a class.
// 100 % abstraction is achived
// muliple inheritance 2. total abstraction
// interface --> implements
// by default public,abstract & without implementation
// final, public and static
interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer {
   public void moves() {
        System.out.println("up,down,left,right,dig");
    }
}
class Rook implements ChessPlayer {
   public void moves() {
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer {
   public void moves() {
        System.out.println("up,down,left,right,dig(1step)");
    }
}
public class Interface2 {
    public static void main(String []args) {
        Queen q = new Queen();
        q.moves();
        
    }
}
// 2nd code
// Define an interface called "Shape"
interface Shape {
    void draw(); // This method will be implemented by classes that implement the Shape interface
}

// Implement the interface in a class called "Circle"
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Implement the interface in a class called "Rectangle"
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(); // Create a Circle object and reference it with the Shape interface
        Shape rectangle = new Rectangle(); // Create a Rectangle object and reference it with the Shape interface
        
        circle.draw(); // This will call the draw() method in the Circle class
        rectangle.draw(); // This will call the draw() method in the Rectangle class
    }
}
