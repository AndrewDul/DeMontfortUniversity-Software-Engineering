package main;

import lib.ScreenRobot;

/**
 * A demonstration application for the ScreenRobot class.
 * Shows the robot moving forward, turning left, and returning to the home position.
 * 
 * @author Andrew
 * @version 1.0
 */
public class ScreenRobotDemo {

    public static void main(String[] args) {
        // Create a new ScreenRobot instance at the default (0, 0) position facing north
        ScreenRobot robot = new ScreenRobot();

        // Display the robot's initial position and direction
        System.out.println(robot);

        // Move the robot forward by 10 units
        robot.forward(10);
        System.out.println("After moving forward by 10 units: " + robot);

        // Turn the robot left (now facing west) and move it forward by 5 units
        robot.turnLeft();
        robot.forward(5);
        System.out.println("After turning left and moving forward by 5 units: " + robot);

        // Turn the robot left again (now facing south) and move it forward by 3 units
        robot.turnLeft();
        robot.forward(3);
        System.out.println("After turning left and moving forward by 3 units: " + robot);

        // Return the robot to the home position (0, 0)
        robot.home();
        System.out.println("After returning home: " + robot);
    }
}
