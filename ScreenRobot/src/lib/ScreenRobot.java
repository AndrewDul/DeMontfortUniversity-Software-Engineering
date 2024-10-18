package lib;

/**
 * The ScreenRobot class represents a robot that moves on a 2D screen.
 * It has a position (x, y) and can move forward, turn left, and return to its home position (0, 0).
 * 
 * The robot can face in one of four directions (north, east, south, west) and can rotate left.
 * 
 * @author Andrew
 * @version 1.0
 */
public class ScreenRobot {
    private int x, y; // Robot's position on the screen (x, y)
    private String direction; // Current direction the robot is facing (north, east, south, west)

    // Constructor initializes the robot's position at (0, 0) and facing north
    public ScreenRobot() {
        this.x = 0;
        this.y = 0;
        this.direction = "north";
    }

    // Method to move the robot forward n units in the current direction
    public void forward(int units) {
        if (units < 0) {
            return; // Ignore negative units
        }
        switch (direction) {
            case "north":
                y += units;
                break;
            case "east":
                x += units;
                break;
            case "south":
                y -= units;
                break;
            case "west":
                x -= units;
                break;
        }
    }

    // Method to rotate the robot 90 degrees to the left
    public void turnLeft() {
        switch (direction) {
            case "north":
                direction = "west";
                break;
            case "west":
                direction = "south";
                break;
            case "south":
                direction = "east";
                break;
            case "east":
                direction = "north";
                break;
        }
    }

    // Method to return the robot to its home position (0, 0)
    public void home() {
        x = 0;
        y = 0;
        direction = "north";
    }

    // Getter methods to retrieve the robot's current position
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Override toString to display robot's position and direction
    @Override
    public String toString() {
        return "ScreenRobot [x=" + x + ", y=" + y + ", direction=" + direction + "]";
    }
}
