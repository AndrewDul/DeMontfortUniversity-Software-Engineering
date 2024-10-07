package scanner;

import java.util.Scanner;

public class ScannerSurprise {

    public static void main(String[] args) {
        // Create a Scanner for keyboard input
        Scanner sc = new Scanner(System.in);        

        System.out.println("Enter a number");
        int number = sc.nextInt(); // Read a number
        System.out.println("You entered the number " + number);
        
        // Consume the newline character
        sc.nextLine(); 
        
        System.out.println("Type a sentence");
        String sentence = sc.nextLine(); // Read a whole line
        System.out.println("You entered the sentence: " + sentence);
        
        System.out.println("Enter a number: ");
        double decimal = sc.nextDouble(); // Read a number
        System.out.println("You entered the decimal: " + decimal);
        
        // Consume the newline character after reading the decimal
        sc.nextLine(); // Fix: Call nextLine() here to consume the newline
        
        System.out.println("Type a sentence");
        sentence = sc.nextLine(); // Read a whole line
        System.out.println("You entered the sentence length: " + sentence.length());
        
        sc.close(); // Close the Scanner
    }
}
