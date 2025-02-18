package main;

import lib.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameListDemo {

    public static void main(String[] args) {
        // Create an ArrayList of type Name using the diamond operator
        List<Name> register = new ArrayList<>();

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user 4 times to enter first and family names
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();  // Store the first name in a variable

            System.out.print("Enter family name: ");
            String familyName = scanner.nextLine();  // Store the family name in a variable

            // Create a new Name object and add it directly to the ArrayList
            register.add(new Name(firstName, familyName));
        }

        // Output the full name of every Name object using the forEach method
        System.out.println("\nList of names:");
        register.forEach(n -> System.out.println(n.getFullName()));

        // Check if there is a surname equal to "Smith" using the Stream API
        boolean exists = register.stream().anyMatch(nm -> nm.getFamilyName().equals("Smith"));
        System.out.println("\nIs there a family name 'Smith' in the list? " + exists);

        // Output names that have a length greater than 10 characters using stream().filter
        System.out.println("\nNames with length greater than 10 characters:");
        register.stream()
                .filter(n -> n.getFullName().length() > 10)  // Filter names based on length
                .forEach(n -> System.out.println(n.getFullName()));  // Output filtered names
        
        
        // Check the functionality of contains() with a new Name object
        Name testName = new Name("Joe", "Bloggs");  // Create a new Name object
        register.add(testName);  // Add it to the list

        // Create another Name object with the same details
        Name duplicateName = new Name("Joe", "Bloggs");

        // Check if the list contains the duplicate Name object
        boolean containsDuplicate = register.contains(duplicateName);
        System.out.println("\nDoes the list contain 'Joe Bloggs'? " + containsDuplicate);
        
        scanner.close();
    }
}

