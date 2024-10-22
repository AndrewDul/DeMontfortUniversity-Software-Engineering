package main;

import java.util.ArrayList;
import lib.Name;
import lib.PairOfDice;
import lib.Player;

public class PlayerApp {

    /**
     * Executes the logic to return a list of players whose gamertag contains their surname
     * and a given number, formatted as "FIRSTNAME, surname".
     * 
     * @param num The number to check in the gamertag.
     * @param players The list of players to evaluate.
     * @return A formatted string of qualifying players.
     */
    public static String execute(int num, ArrayList<Player> players) {
        StringBuilder result = new StringBuilder();
        
        // Iterate over each player and check if they qualify
        for (Player player : players) {
            String surname = player.getName().getFamilyName().toLowerCase();
            String gamertag = player.getGamertag().toLowerCase();
            
            // Check if gamertag contains surname and the given number
            if (gamertag.contains(surname) && gamertag.contains(String.valueOf(num))) {
                // Format the player's name as "FIRSTNAME, surname" and add it to the result
                result.append(player.getName().getFirstName().toUpperCase())
                      .append(", ")
                      .append(player.getName().getFamilyName().toLowerCase())
                      .append("\n");
            }
        }
        
        return result.toString();
    }

    /**
     * Main method to run the PlayerApp and demonstrate the functionality.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create some example players
        ArrayList<Player> players = new ArrayList<>();
        
        // Example names and players
        Name name1 = new Name("Joe", "Bloggs");
        Name name2 = new Name("Jane", "Doe");
        
        Player player1 = new Player("gamertag123", name1, new PairOfDice());
        Player player2 = new Player("janedoe123", name2, new PairOfDice());
        
        // Add players to the list
        players.add(player1);
        players.add(player2);
        

        // Run the execute method with number 123 and print the result
        String result = execute(123, players);
        
        System.out.println(result);
    }
}
