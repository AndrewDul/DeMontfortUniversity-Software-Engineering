package main;

import lib.GameCharacter;

/**
 * A demonstration application for the GameCharacter class.
 * Shows a game character collecting rewards, losing lives, and buying lives.
 * 
 * @author Andrew
 * @version 1.0
 */
public class GameCharacterDemo {

    public static void main(String[] args) {
        // Create a game character with 3 lives, 50 rewards, and 10 rewards required per life
        GameCharacter character = new GameCharacter(3, 50, 10);
        
        // Display initial character information
        System.out.println(character);
        
        // Add 20 rewards to the character
        character.addRewards(20);
        System.out.println("After adding 20 rewards: " + character);
        
        // Character loses a life
        character.loseLife();
        System.out.println("After losing 1 life: " + character);
        
        // Character buys a life using rewards
        character.buyLife();
        System.out.println("After buying 1 life: " + character);
        
        // Character loses 3 lives and dies
        character.loseLife();
        character.loseLife();
        character.loseLife();
        System.out.println("After losing 3 more lives: " + character);
        
        // Try to add rewards after character is dead
        character.addRewards(10);
        System.out.println("After trying to add rewards when dead: " + character);
    }
}
