package MyThread;

// Task
//Class implementation - Runnable

class MyThread implements Runnable {
 private String threadName;

 public MyThread(String name) {
     this.threadName = name;
 }

 @Override
 public void run() {
     for (int i = 0; i < 5; i++) {
         System.out.println(threadName + " is running: " + i);
     }
 }
}

//Main Class

public class ConcurrencyExample {
 public static void main(String[] args) {
	 
     // Creating Objects - Runnable
	 
     Runnable thread1 = new MyThread("Thread 1");
     Runnable thread2 = new MyThread("Thread 2");
     Runnable thread3 = new MyThread("Thread 3");
//     Runnable thread4 = new MyThread("Thread 4");
//     Runnable thread5 = new MyThread("Thread 5");
//     Runnable thread6 = new MyThread("Thread 6");

     // Creating and running threads
     
     new Thread(thread1).start();
     new Thread(thread2).start();
     new Thread(thread3).start();
//     new Thread(thread4).start();
//     new Thread(thread5).start();
//     new Thread(thread6).start();
 }
}

