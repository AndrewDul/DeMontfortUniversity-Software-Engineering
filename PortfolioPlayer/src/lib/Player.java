package lib;

/**
 * The Player class represents a player in the game, with a name, rollable pair of dice, and a gamer tag.
 */
public class Player implements Comparable<Player> { // Implement Comparable interface
    
    // Fields for the player's name, rollable pair of dice, and gamer tag.
    private Name name;
    private Rollable rollable;
    private String gamertag;
    
    /**
     * Default constructor that assigns default values to the fields.
     */
    public Player() {
        this.name = new Name(); // Default Name object
        this.rollable = new PairOfDice(); // Default Rollable object, could be PairOfDice
        this.gamertag = ""; // Default gamer tag
    }
    
    /**
     * Constructor that accepts a gamertag and a Name object, assigns default Rollable.
     * @param gamertag The player's gamer tag.
     * @param name The player's name.
     */
    public Player(String gamertag, Name name) {
        this.name = name;
        this.rollable = new PairOfDice(); // Default Rollable
        this.gamertag = gamertag;
    }
    
    /**
     * Constructor that accepts a gamertag, a Name object, and a Rollable object.
     * @param gamertag The player's gamer tag.
     * @param name The player's name.
     * @param rollable The player's rollable dice.
     */
    public Player(String gamertag, Name name, Rollable rollable) {
        this.name = name;
        this.rollable = rollable;
        this.gamertag = gamertag;
    }
    
    /**
     * Getter for the player's name.
     * @return The player's name.
     */
    public Name getName() {
        return name;
    }
    
    /**
     * Setter for the player's name.
     * @param name The new name of the player.
     */
    public void setName(Name name) {
        this.name = name;
    }
    
    /**
     * Getter for the player's rollable object.
     * @return The player's rollable object.
     */
    public Rollable getRollable() {
        return rollable;
    }
    
    /**
     * Getter for the player's gamer tag.
     * @return The player's gamer tag.
     */
    public String getGamertag() {
        return gamertag;
    }
    
    /**
     * Setter for the player's gamer tag.
     * @param gamertag The new gamer tag for the player.
     */
    public void setGamertag(String gamertag) {
        this.gamertag = gamertag;
    }
    
    /**
     * Rolls the dice for the player.
     */
    public void rollDice() {
        rollable.roll();
    }
    
    /**
     * Gets the score of the dice after rolling.
     * @return The score from the rollable object.
     */
    public int getDiceScore() {
        return rollable.getScore();
    }
    
    /**
     * Method to set the player's full name by extracting and capitalizing first and last name.
     * @param fullName The player's full name as a single string.
     */
    public void setPlayerFullName(String fullName) {
        String[] names = fullName.split(" ");
        if (names.length == 2) {
            String firstName = capitalize(names[0]);
            String lastName = capitalize(names[1]);
            name.setFirstName(firstName);
            name.setFamilyName(lastName);
        }
    }
    
    /**
     * Helper method to capitalize the first letter of a string and convert the rest to lowercase.
     * @param str The string to capitalize.
     * @return The capitalized string.
     */
    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    
    /**
     * Generates a gamertag based on player's name and the provided number.
     * @param number The number to append to the generated gamertag.
     */
    public void generateGamertag(int number) {
        if (number >= 1 && number <= 100) {
            String reversedFirstName = new StringBuilder(name.getFirstName().toLowerCase()).reverse().toString();
            String reversedLastName = new StringBuilder(name.getFamilyName().toLowerCase()).reverse().toString();
            this.gamertag = reversedFirstName + reversedLastName + number;
        }
    }

    /**
     * Returns a string representation of the player.
     * @return The player's details as a string.
     */
    @Override
    public String toString() {
        return "Player{" +
                "name=" + name +
                ", rollable=" + rollable +
                ", gamertag='" + gamertag + '\'' +
                '}';
    }

    /**
     * Implements the compareTo method to allow sorting of Player objects.
     * Players will be sorted based on their family name (surname) and first name if necessary.
     * @param other The other Player object to compare.
     * @return A negative integer, zero, or a positive integer as this player is less than, equal to, or greater than the specified player.
     */
    @Override
    public int compareTo(Player other) {
        int lastNameComparison = this.name.getFamilyName().compareTo(other.getName().getFamilyName());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        // If last names are equal, compare by first name
        return this.name.getFirstName().compareTo(other.getName().getFirstName());
    }
}
