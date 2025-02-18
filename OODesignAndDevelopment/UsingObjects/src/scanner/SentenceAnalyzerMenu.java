package scanner;

import java.util.Scanner;

public class SentenceAnalyzerMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            // Display the menu
            printMenu();

            // Get the user's choice
            System.out.print("Please select an option: ");
            option = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (option) {
                case 1:
                    // Start the sentence analysis
                    analyzeSentence(sc);
                    break;
                case 2:
                    // Display the about section
                    displayAbout();
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid option. Please select 1, 2, or 3.");
            }
        } while (option != 3);

        // Close the scanner
        sc.close();
    }

    // Function to display the menu
    private static void printMenu() {
        System.out.println("********************************************");
        System.out.println("*      Welcome to the Sentence Analyzer    *");
        System.out.println("********************************************");
        System.out.println("1. Start the program");
        System.out.println("2. About the program");
        System.out.println("3. Exit");
        System.out.println("**********************************");
    }

    // Function to analyze the sentence
    private static void analyzeSentence(Scanner sc) {
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine(); // Read the entire line

        // Call methods to calculate results
        int wordCount = countWords(sentence);
        int vowelCount = countVowels(sentence);
        double vowelPercentage = calculateVowelPercentage(sentence, vowelCount);

        // Output the results
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.printf("Percentage of letters that are vowels: %.2f%%\n", vowelPercentage);
    }

    // Function to display the about section
    private static void displayAbout() {
        System.out.println("\n**********************************");
        System.out.println("     About the Sentence Analyzer    ");
        System.out.println("**********************************");
        System.out.println("This program allows you to input a sentence,");
        System.out.println("then it calculates the number of words, vowels,");
        System.out.println("and the percentage of letters that are vowels.");
        System.out.println("\nAuthor: Andrzej, student at De Montfort University");
        System.out.println("Program created as part of practical exercises.");
        System.out.println("**********************************\n");
    }

    // Method to count the number of words in the sentence
    private static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Method to count the number of vowels in the sentence
    private static int countVowels(String sentence) {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    // Method to calculate the percentage of vowels in the sentence
    private static double calculateVowelPercentage(String sentence, int vowelCount) {
        int letterCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            }
        }

        if (letterCount == 0) {
            return 0;
        }
        return ((double) vowelCount / letterCount) * 100;
    }
}