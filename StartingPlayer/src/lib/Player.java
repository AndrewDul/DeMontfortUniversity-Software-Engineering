package lib;

import lib.Name;
import lib.PairOfDice;

/**
 * Player class represents a player in a game.
 * It has fields for the player's name, dice, and gamertag.
 * This class allows rolling dice and getting the dice score.
 * 
 * @author Andrew
 * @version 1.0
 */
public class Player{
    private Name name;           // Name of the player
    private PairOfDice dice;     // Pair of dice for the player
    private String gamertag;     // Player's gamertag

    /**
     * Default constructor that initializes fields with default values.
     */
    public Player() {
        this.name = new Name("Default", "Player");
        this.dice = new PairOfDice();
        this.gamertag = "UnknownTag";
    }

    /**
     * Constructor that accepts a gamertag and a Name object.
     * Initializes the dice with default values.
     * 
     * @param gamertag Player's custom gamertag
     * @param name Player's name
     */
    public Player(String gamertag, Name name) {
        this.gamertag = gamertag;
        this.name = name;
        this.dice = new PairOfDice(); // Default dice
    }

    /**
     * Constructor that accepts values for all three fields.
     * 
     * @param gamertag Player's custom gamertag
     * @param name Player's name
     * @param dice Player's dice
     */
    public Player(String gamertag, Name name, PairOfDice dice) {
        this.gamertag = gamertag;
        this.name = name;
        this.dice = dice;
    }

    // Getter and setter for Name
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    // Getter for PairOfDice
    public PairOfDice getDice() {
        return dice;
    }

    // Getter and setter for gamertag
    public String getGamertag() {
        return gamertag;
    }

    public void setGamertag(String gamertag) {
        this.gamertag = gamertag;
    }

    // Method to roll the dice
    public void rollDice() {
        dice.roll();
    }

    // Method to get the score from the dice
    public int getDiceScore() {
        return dice.getScore();
    }

    /**
     * toString method to return a string representation of the Player.
     */
    @Override
    public String toString() {
        return "Player: " + name.getFullName() + ", Gamertag: " + gamertag + ", Dice score: " + getDiceScore();
    }
}
