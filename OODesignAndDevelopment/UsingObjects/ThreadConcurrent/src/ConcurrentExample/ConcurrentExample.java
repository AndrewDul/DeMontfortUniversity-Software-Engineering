package ConcurrentExample;

public class ConcurrentExample {
	 public static void main(String[] args) {
	        Thread thread1 = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                System.out.println("Wątek 1 - Iteracja " + i);
	                try {
	                    Thread.sleep(16000); // Symulacja pracy
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        Thread thread2 = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                System.out.println("Wątek 2 - Iteracja " + i);
	                try {
	                    Thread.sleep(500); // Symulacja pracy
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        thread1.start();
	        thread2.start();
	    }
}
