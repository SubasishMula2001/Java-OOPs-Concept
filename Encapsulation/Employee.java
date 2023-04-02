// Encapsulation : it is the process of hiding the internal details of an object from outside of the world.

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

//In this example, the emp_id and emp_name variables are encapsulated as private
//and can be accessed only through the public getter and setter methods.
