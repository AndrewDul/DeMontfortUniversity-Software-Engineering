package primitives;

import java.util.Scanner;

public class MyNote {

    // Method that adds two numbers
    public static int add(int x, int y) {
        return x + y;  // Return the sum of x and y
    }
    
    // Method that subtracts two numbers
    public static int subtract(int x, int y) {
        return x - y;  // Return the difference of x and y
    }
    
    // Method that multiplies two numbers
    public static int multiply(int x, int y) {
        return x * y;  // Return the product of x and y
    }
    
    // Method that divides two numbers
    public static double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) x / y;  // Return the quotient of x and y
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter operation number (1-5): ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition result: " + add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction result: " + subtract(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication result: " + multiply(a, b));
                    break;
                case 4:
                    try {
                        System.out.println("Division result: " + divide(a, b));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();  // Closing the Scanner after input is done
    }
}
