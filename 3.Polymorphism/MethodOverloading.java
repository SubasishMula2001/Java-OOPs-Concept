// Polymorphism means "many forms" and it refers to the ability of an object to take
// on many forms or to have multiple behaviors.
// Method overloading : -> Method overloading is when two or more methods 
// Compile-time polymorphism
 // in a class have the same name but different parameters
 // This is the ability of an object to take on many forms.
  // In Java, polymorphism is achieved by using method overloading and method overriding
 class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3)); // Output: 5
        System.out.println(calculator.add(2, 3, 4)); // Output: 9
    }
}
