package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        // Asking for address
        System.out.println("Type your address, and press Enter");
        String address = sc.nextLine(); // read a whole line
        System.out.println("You live at " + address);

        // Asking for first name
        System.out.println("Type your first name, and press Enter");
        String name = sc.next(); // read next token as String
        System.out.println("Hello " + name);

        // Asking for last name
        System.out.println("Type your last name, and press Enter");
        String lastName = sc.next(); // read next token as String
        System.out.println("Your full name is " + name + " " + lastName);

        // Asking for age
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

        // Asking for gender
        sc.nextLine(); // This line clears the buffer after nextInt()
        String gender = "";
        boolean validGender = false;

        while (!validGender) {
            System.out.println("Enter your gender \n(Male / Female / Other): ");
            gender = sc.nextLine().toLowerCase(); // Convert input to lowercase for easier comparison
            if (gender.equals("male") || gender.equals("female") || gender.equals("other")) {
                validGender = true;
            } else {
                System.out.println("That's not a valid gender. Please try again.");
            }
        }

        System.out.println("You have selected: " + gender);

        // Close the Scanner
        sc.close();
    }
}
