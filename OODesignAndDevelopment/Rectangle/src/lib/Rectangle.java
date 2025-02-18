package lib;

/**
 * The Rectangle class represents a rectangle with a specific position, width, and height.
 * It allows moving and resizing the rectangle, as well as calculating its area and perimeter.
 * 
 * @author Andrew
 * @version 1.0
 */
public class Rectangle {
    private int x, y; // Top-left corner coordinates (x, y)
    private int w, h; // Width and height of the rectangle

    // Constructor
    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    // Method to return the area of the rectangle
    public int getArea() {
        return w * h;
    }

    // Method to return the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (w + h);
    }

    // Method to move the rectangle by dx and dy
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Method to expand the rectangle by scale factors for width and height
    public void expand(double scaleW, double scaleH) {
        w *= scaleW;
        h *= scaleH;
    }

    // Getter methods for x, y, width, and height
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }

    // Override toString method to display rectangle information
    @Override
    public String toString() {
        return "Rectangle [x=" + x + ", y=" + y + ", width=" + w + ", height=" + h + "]";
    }
}
