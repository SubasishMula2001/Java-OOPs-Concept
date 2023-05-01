 // Inheritance is mechanism in which a class aquire the property 
 //and behaviour of its parent class
 // reusabality 
 
class Shape {
   public void area() {
       System.out.println("display area");
   }
}

class Triangle extends Shape {
    public void area(int l, int h ) {
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

// class EquilateralTriangle extends Triangle {
//     public void area(int l, int h) {
//         System.out.println(1/2*l*h);
//     }
// }
