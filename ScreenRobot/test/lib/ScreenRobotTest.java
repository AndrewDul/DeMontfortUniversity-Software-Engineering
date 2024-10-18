package lib;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit tests for the ScreenRobot class.
 * Tests robot movements, turning left, and returning to the home position.
 * 
 * @author Andrew
 */
public class ScreenRobotTest {

    @Test
    public void testInitialPosition() {
        ScreenRobot robot = new ScreenRobot();
        assertEquals("Initial x should be 0", 0, robot.getX());
        assertEquals("Initial y should be 0", 0, robot.getY());
    }

    @Test
    public void testForwardNorth() {
        ScreenRobot robot = new ScreenRobot();
        robot.forward(10);
        assertEquals("y should be 10 after moving forward", 10, robot.getY());
        assertEquals("x should remain 0", 0, robot.getX());
    }

    @Test
    public void testTurnLeft() {
        ScreenRobot robot = new ScreenRobot();
        robot.turnLeft(); // Now facing west
        robot.forward(5);
        assertEquals("x should be -5 after moving forward", -5, robot.getX());
        assertEquals("y should remain 0", 0, robot.getY());
    }

    @Test
    public void testHome() {
        ScreenRobot robot = new ScreenRobot();
        robot.forward(10);
        robot.turnLeft();
        robot.forward(5);
        robot.home(); // Return to (0, 0)
        assertEquals("x should be 0 after returning home", 0, robot.getX());
        assertEquals("y should be 0 after returning home", 0, robot.getY());
    }

    @Test
    public void testForwardNegative() {
        ScreenRobot robot = new ScreenRobot();
        robot.forward(-5); // Ignore negative forward value
        assertEquals("x should remain 0", 0, robot.getX());
        assertEquals("y should remain 0", 0, robot.getY());
    }
}
