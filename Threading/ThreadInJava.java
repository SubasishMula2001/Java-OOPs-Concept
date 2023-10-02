Thread : A thread is a path of execution within a process . It is also known as lightweight process. Thread 
allow multiple task to be preformed concurrently within a single process. Thread within a process share the same 
memory and same resource.
    1. By Extending Thread class.
    2. By implementing Runnable interface.
// Using thread class
class MultiThreading extends Thread {
    public void run() {
        try {
            System.out.println("Thread "+Thread.currentThread().getId() +" is running");
        } catch(Exception e) {
            System.out.println("Exception is caused");
        }
    }
}

public class MultiThread {
    public static void main(String args[]) {
      int n = 8;
      for(int i =0;i<n;i++) {
          MultiThreading obj = new MultiThreading();
          obj.start();
      }
    }
}
// Using runnalbe interface
class MulitiThreading implements Runnable {
    public void run() {
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        } catch(Exception e) {
         System.out.println("Exception is caused");
      }
    } 
}
public class UsingRunnable {
    public static void main(String []args) {
    int n = 8;
    for(int i =0;i<n;i++) {
        Thread obj = new Thread(new MultiThreading());
        obj.start();
    }
 }
}
