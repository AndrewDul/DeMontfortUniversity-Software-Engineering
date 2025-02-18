package lib;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit tests for the Rectangle class.
 * Tests methods for moving, expanding, and calculating the area and perimeter of the rectangle.
 * 
 * @author Andrew
 * @version 1.0
 */
public class RectangleTest {

    @Test
    public void testGetArea() {
        Rectangle rect = new Rectangle(0, 0, 10, 5); // Rectangle with width 10 and height 5
        assertEquals("Area should be 50", 50, rect.getArea());
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rect = new Rectangle(0, 0, 10, 5); // Rectangle with width 10 and height 5
        assertEquals("Perimeter should be 30", 30, rect.getPerimeter());
    }

    @Test
    public void testMove() {
        Rectangle rect = new Rectangle(0, 0, 10, 5); // Rectangle initially at (0, 0)
        rect.move(3, 2); // Move the rectangle 3 units right and 2 units down
        assertEquals("x should be 3 after moving", 3, rect.getX());
        assertEquals("y should be 2 after moving", 2, rect.getY());
    }

    @Test
    public void testExpand() {
        Rectangle rect = new Rectangle(0, 0, 10, 5); // Rectangle with width 10 and height 5
        rect.expand(2, 1.5); // Expand width by 2x and height by 1.5x
        assertEquals("Width should be 20 after expansion", 20, rect.getWidth());
        assertEquals("Height should be 7 after expansion", 7, rect.getHeight());
    }
}
