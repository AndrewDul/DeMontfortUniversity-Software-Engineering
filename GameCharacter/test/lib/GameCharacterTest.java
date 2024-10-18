package lib;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit tests for the GameCharacter class.
 * Tests adding rewards, losing lives, buying lives, and the alive status of the character.
 * 
 * @author Andrew
 */
public class GameCharacterTest {

    @Test
    public void testAddRewards() {
        GameCharacter character = new GameCharacter(3, 50, 10);
        character.addRewards(20);
        assertEquals("Rewards should be 70 after adding 20 rewards", 70, character.getRewards());
    }

    @Test
    public void testLoseLife() {
        GameCharacter character = new GameCharacter(3, 50, 10);
        character.loseLife();
        assertEquals("Lives should be 2 after losing 1 life", 2, character.getLivesRemaining());
    }

    @Test
    public void testBuyLife() {
        GameCharacter character = new GameCharacter(3, 50, 10);
        character.buyLife();
        assertEquals("Lives should be 4 after buying 1 life", 4, character.getLivesRemaining());
        assertEquals("Rewards should be 40 after buying 1 life", 40, character.getRewards());
    }

    @Test
    public void testIsAlive() {
        GameCharacter character = new GameCharacter(1, 50, 10);
        character.loseLife();
        assertFalse("Character should be dead after losing the last life", character.isAlive());
    }

    @Test
    public void testAddRewardsWhenDead() {
        GameCharacter character = new GameCharacter(1, 50, 10);
        character.loseLife(); // Character dies
        character.addRewards(20);
        assertEquals("Rewards should remain 50 after trying to add rewards when dead", 50, character.getRewards());
    }
}
