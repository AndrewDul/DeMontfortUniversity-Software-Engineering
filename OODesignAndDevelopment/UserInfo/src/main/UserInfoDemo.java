package main;

import lib.User;
import java.util.Scanner;

public class UserInfoDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your emoji (use Windows logo key + . ): ");
        String email = scanner.nextLine();

        System.out.print("What is your current occupation? ");
        String occupation = scanner.nextLine();

        // Creating User object
        User user = new User(firstName, lastName, email, occupation);

        // Printing the user information
        System.out.println("\n" + user);
        
        scanner.close();
    }
}
