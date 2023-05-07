// Method overloading : -> Method overloading is when two or more methods 
// Compile-time polymorphism
 // in a class have the same name but different parameters
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
