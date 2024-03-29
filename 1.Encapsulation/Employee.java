// Encapsulation : it is the process of hiding the internal details of an object from outside of the world.
 // In Java, encapsulation is achieved by using access modifiers like private, public, and protected.

// Binding (or wrapping) code and data together into a single unit are known as encapsulation

// Coupling
// Coupling refers to the knowledge or information or dependency of another class

// Cohesion
// Cohesion refers to the level of a component which performs a single well-defined task. A single well-defined task is done by a highly
//  cohesive method. The weakly cohesive method will split the task into separate parts.

// Aggregation
// Aggregation is a way to achieve Association. Aggregation represents the relationship where one object contains other objects as a part of its state.


public class Employee {
    private int emp_id;
    private String emp_name;
    
    public int getEmpId() {
        return emp_id;
    }
    public void setEmpId(int emp_id) {
        this.emp_id = emp_id;
    }
    public String getName() {
        return emp_name;
    }
    public void setName(String emp_name) {
        this.emp_name = emp_name;
    }
    public static void main(String args[]) {
     Employee obj = new Employee();
     
     obj.setEmpId(1);
     obj.setName("Subasish");
     System.out.println(obj.getEmpId());
     System.out.println(obj.getName());
    }
}
// In this code, the class "Employee" has two private member variables "emp_id" and "emp_name". These variables are
// made private so that they cannot be accessed directly from outside the class. Instead, public methods "setEmpId", "getEmpId",
// "setName", and "getName" are provided to set and get the values of these variables.

// This way, the internal details of the Employee object (i.e. emp_id and emp_name) are hidden from the outside world, 
// and can only be accessed through the publicmethods provided by the class. This is the concept of encapsulation.

// In the main method, an object of the Employee class is created, and its member variables are set using the public methods.
// Finally, the values of the member variables are printed using the getter methods.



// Advantages of Encapsulation in Java:

// Data Hiding: Encapsulation allows you to hide the internal details and implementation of an object from the outside world. This prevents unauthorized
//  access and manipulation of an object's state.

// Flexibility and Maintenance: You can change the internal implementation of a class (e.g., modify data structures or algorithms) without affecting the 
//  classes that use it, as long as you maintain the public interface. This promotes code flexibility and easier maintenance.

// Reusability: Encapsulated classes can be reused in different parts of your program or in other projects because they provide a clear and consistent interface
//  for interaction.

// Disadvantages of Encapsulation in Java:

// Complexity: Over-encapsulation, where every field is hidden behind getters and setters, can lead to excessive complexity in your code,
//  making it harder to read and maintain. You should balance encapsulation with the need for simplicity and clarity.

// Potential for Poor Design: Overly restrictive encapsulation can lead to poor design choices, such as creating too many getters and
//  setters, which can make the code less intuitive and harder to use.
 
// Increased code execution: Encapsulation results in an increase in the duration of the program execution. It is because more instructions 
//  are added to the code therefore they require more time to execute.
