package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your address, and press Enter");
        String address = sc.nextLine(); // read a whole line
        System.out.println("You live at " + address);

        System.out.println("Type your first name, and press Enter");
        String name = sc.next(); // read next token as String
        System.out.println("Hello " + name);

        int age = 0;
        boolean validAge = false;

        // Loop to read age until a valid value is obtained
        while (!validAge) {
            System.out.println("Enter your age: ");
            try {
                age = sc.nextInt(); // read value as int
                if (age >= 0) { // check if age is non-negative
                    validAge = true; // set flag to true to exit loop
                } else {
                    System.out.println("Age cannot be negative. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("That's not a valid number. Please try again.");
                sc.next(); // clear the invalid token from the buffer
            }
        }

        System.out.println("You are " + age + " years old");

        // You can add additional questions and logic here...

        sc.close(); // close the Scanner
    }
}
