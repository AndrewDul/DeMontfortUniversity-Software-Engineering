package main;

import lib.Rectangle;

/**
 * A demonstration application for the Rectangle class.
 * Shows creating a rectangle, moving it, resizing it, and calculating its area and perimeter.
 * 
 * @author Andrew
 * @version 1.0
 */
public class RectangleDemo {

    public static void main(String[] args) {
        // Create a rectangle at position (0, 0) with width 10 and height 5
        Rectangle rect = new Rectangle(0, 0, 10, 5);

        // Display initial rectangle information
        System.out.println(rect);

        // Calculate and display the area and perimeter
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        // Move the rectangle by 3 units right and 2 units down
        rect.move(3, 2);
        System.out.println("After moving: " + rect);

        // Expand the rectangle's width by 2x and height by 1.5x
        rect.expand(2, 1.5);
        System.out.println("After expansion: " + rect);

        // Recalculate and display the new area and perimeter
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
