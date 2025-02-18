package lib;

public class ModuloCounter {

    // Fields to store the current count, max value, and number of cycles
    private int count;
    private int maxValue;
    private int cycles;  // Tracks how many times the counter has wrapped around

    // Default constructor with max value
    public ModuloCounter(int maxValue) {
        this.count = 0;  // Initialize count to 0
        this.maxValue = maxValue;  // Set the maximum value
        this.cycles = 0;  // Initialize cycles to 0
    }

    // Constructor with both initial count and max value
    public ModuloCounter(int count, int maxValue) {
        this.maxValue = maxValue;
        this.count = count % maxValue;  // Ensure the count is within the valid range
        this.cycles = 0;  // Initialize cycles to 0
    }

    // Getter for the current count
    public int getCount() {
        return count;
    }

    // Getter for cycles
    public int getCycles() {
        return cycles;
    }

    // Setter for count, ensuring it stays within the range [0, maxValue-1]
    public void setCount(int count) {
        this.count = count % maxValue;
    }

    // Increment method, wraps around when count reaches maxValue and increments cycles
    public void increment() {
        count = (count + 1) % maxValue;
        if (count == 0) {
            cycles++;  // Increment the cycles count when counter wraps to 0
        }
    }

    // Decrement method, wraps around when count goes below 0 and increments cycles
    public void decrement() {
        count = (count - 1 + maxValue) % maxValue;
        if (count == maxValue - 1) {
            cycles++;  // Increment the cycles count when counter wraps backward to maxValue - 1
        }
    }

    // toString method to represent the ModuloCounter object in a string format
    @Override
    public String toString() {
        return "ModuloCounter [count=" + count + ", maxValue=" + maxValue + ", cycles=" + cycles + "]";
    }
}
