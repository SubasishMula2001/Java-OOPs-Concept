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
