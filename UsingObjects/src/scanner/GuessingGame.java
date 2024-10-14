package scanner;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner sc = new Scanner(System.in);
        // Create a Random object to generate a random number
        Random rand = new Random();
        String playAgain;

        do {
            // Display ASCII art and menu
            printGameHeader();

            // Generate a random number between 1 and 20
            int target = rand.nextInt(20) + 1; // Random number from 1 to 20
            int guess = 0;
            int attempts = 0; // Attempts counter

            System.out.println("Try to guess the number!");

            // Loop until the player guesses the correct number
            while (guess != target) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt(); // Get the guess from the player
                attempts++; // Increase the attempts counter

                if (guess < target) {
                    System.out.println("Too low! Try again.");
                } else if (guess > target) {
                    System.out.println("Too high! Try again.");
                } else {
                    // If the guess is correct
                    System.out.println(guess + " is the correct answer.");
                    System.out.println("You took " + attempts + " guesses.");

                    // Rating based on the number of attempts
                    if (attempts <= 3) {
                        System.out.println("Star rating: Excellent");
                    } else if (attempts <= 5) {
                        System.out.println("Star rating: Good");
                    } else {
                        System.out.println("Star rating: Below Average");
                    }
                }
            }

            // Ask the player if they want to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next(); // Read the player's response
        } while (playAgain.equalsIgnoreCase("yes")); // Continue if the player wants to play again

        // Close the scanner
        System.out.println("\nThanks for playing!");
        sc.close();
    }

    // Function to display the game header with ASCII art
    private static void printGameHeader() {
        System.out.println("********************************************************************************");
        printGameName(); // Print the ASCII art of the game name
        System.out.println("********************************************************************************");
        System.out.println("\n************** MENU **************");
        System.out.println("*  1. Guess a number             *");
        System.out.println("*  2. Exit the game              *");
        System.out.println("*******************************************************************************\n");
    }

    // Function to print the game name "GuessingGame" in ASCII art
    private static void printGameName() {
        System.out.println(" _______           _______  _______  _______ _________ _        _______ ");
        System.out.println("(  ____ \\|\\     /|(  ____ \\(  ____ \\(  ____ \\\\__   __/( (    /|(  ____ \\");
        System.out.println("| (    \\/| )   ( || (    \\/| (    \\/| (    \\/   ) (   |  \\  ( || (    \\/");
        System.out.println("| |      | |   | || (__    | (_____ | (_____    | |   |   \\ | || |      ");
        System.out.println("| | ____ | |   | ||  __)   (_____  )(_____  )   | |   | (\\ \\) || | ____ ");
        System.out.println("| | \\_  )| |   | || (            ) |      ) |   | |   | | \\   || | \\_  )");
        System.out.println("| (___) || (___) || (____/\\/\\____) |/\\____) |___) (___| )  \\  || (___) |");
        System.out.println("(_______)(_______)(_______/\\_______)\\_______)\\_______/|/    )_)(_______)");
        System.out.println("                                                                         ");
        System.out.println(" _______  _______  _______  _______                                      ");
        System.out.println("(  ____ \\(  ___  )(       )(  ____ \\                                     ");
        System.out.println("| (    \\/| (   ) || () () || (    \\/                                     ");
        System.out.println("| |      | (___) || || || || (__                                         ");
        System.out.println("| | ____ |  ___  || |(_)| ||  __)                                        ");
        System.out.println("| | \\_  )| (   ) || |   | || (                                           ");
        System.out.println("| (___) || )   ( || )   ( || (____/\\                                     ");
        System.out.println("(_______)|/     \\||/     \\|(_______/                                     ");
    }
}
