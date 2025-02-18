package lib;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ModuloCounterTest {

    private ModuloCounter counter;

    // Method to set up the initial state before each test
    @Before
    public void setUp() {
        counter = new ModuloCounter(5);  // Set max value to 5
    }

    // Test to check if the initial counter value is 0
    @Test
    public void testInitialCount() {
        assertEquals(0, counter.getCount());
    }

    // Test to check if increment works correctly
    @Test
    public void testIncrement() {
        counter.increment();
        assertEquals(1, counter.getCount());  // Should be 1 after one increment
    }

    // Test to check wrapping after reaching max value
    @Test
    public void testWrapAround() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
        assertEquals(0, counter.getCount());  // Should wrap to 0 after 5 increments
    }

    // Test to check if the cycle count increases after wrapping
    @Test
    public void testCycles() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
        assertEquals(1, counter.getCycles());  // Should be 1 cycle after first wrap

        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
        assertEquals(2, counter.getCycles());  // Should be 2 cycles after two wraps
    }

    // Test to check decrement functionality
    @Test
    public void testDecrement() {
        counter.increment();
        counter.decrement();
        assertEquals(0, counter.getCount());  // Should return to 0 after one increment and one decrement

        counter.decrement();
        assertEquals(4, counter.getCount());  // Should wrap to 4 after decrementing below 0
    }
}
