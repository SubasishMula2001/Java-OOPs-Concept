// Polymorphism is the ability of object to take many forms, it is done by method overloading and method overriding.

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
