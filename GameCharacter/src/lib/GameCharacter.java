package lib;

/**
 * The GameCharacter class represents a game character that has lives and collects rewards.
 * The character can lose or buy lives using rewards, and once out of lives, it is considered dead.
 * 
 * @author Andrew
 * @version 1.0
 */
public class GameCharacter {
    private int lives;
    private int rewards;
    private int rewardsPerLife;

    // Constructor to initialize the game character with lives and rewards
    public GameCharacter(int lives, int rewards, int rewardsPerLife) {
        this.lives = lives;
        this.rewards = rewards;
        this.rewardsPerLife = rewardsPerLife;
    }

    // Method to add rewards (only if the character is alive)
    public void addRewards(int rewards) {
        if (isAlive()) {
            this.rewards += rewards;
        }
    }

    // Method to set the number of rewards required to buy a life
    public void setRewardsPerLife(int rewardsPerLife) {
        this.rewardsPerLife = rewardsPerLife;
    }

    // Method to get the remaining number of lives
    public int getLivesRemaining() {
        return lives;
    }

    // Method to get the current number of rewards
    public int getRewards() {
        return rewards;
    }

    // Method to lose a life (only if the character is alive)
    public void loseLife() {
        if (isAlive() && lives > 0) {
            lives--;
        }
    }

    // Method to buy a life using rewards (only if the character is alive and has enough rewards)
    public void buyLife() {
        if (isAlive() && rewards >= rewardsPerLife) {
            lives++;
            rewards -= rewardsPerLife;
        }
    }

    // Method to check if the character is still alive
    public boolean isAlive() {
        return lives > 0;
    }

    // Override toString method to display character status
    @Override
    public String toString() {
        return "GameCharacter [lives=" + lives + ", rewards=" + rewards + ", rewardsPerLife=" + rewardsPerLife + "]";
    }
}
