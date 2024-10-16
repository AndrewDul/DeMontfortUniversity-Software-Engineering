package main;

import lib.ModuloCounter;

public class ModuloCounterDemo {
    public static void main(String[] args) {
        // Create a ModuloCounter with a max value of 5
        ModuloCounter counter = new ModuloCounter(5);

        // Test the wrapping functionality by incrementing the counter
        System.out.println("Initial count: " + counter.getCount());  // Should be 0
        System.out.println("Initial cycles: " + counter.getCycles());  // Should be 0
        
        // Increment the counter and observe the wrapping behavior
        for (int i = 0; i < 12; i++) {  // Go beyond maxValue to see the wrap-around effect and cycles
            counter.increment();
            System.out.println("After incrementing: " + counter.getCount() + ", Cycles: " + counter.getCycles());
        }

        // Test the wrapping functionality by decrementing the counter
        System.out.println("\nNow decrementing...");
        for (int i = 0; i < 12; i++) {  // Decrease count below 0 to see the wrap-around and cycles increase
            counter.decrement();
            System.out.println("After decrementing: " + counter.getCount() + ", Cycles: " + counter.getCycles());
        }
    }
}
