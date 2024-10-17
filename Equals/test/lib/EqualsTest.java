package lib;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for the Equals class.
 * This class tests the various functionalities of the Equals class.
 * 
 * @author Andrew
 * @version 1.0
 */
public class EqualsTest {

    @Test
    public void testDefaultConstructor() {
        Equals name = new Equals();
        
        assertEquals("Default first name should be empty", "", name.getFirstName());
        assertEquals("Default family name should be empty", "", name.getFamilyName());
    }
    
    @Test
    public void testCustomConstructor() {
        Equals name = new Equals("John", "Doe");
        
        assertEquals("First name should be John", "John", name.getFirstName());
        assertEquals("Family name should be Doe", "Doe", name.getFamilyName());
    }

    @Test
    public void testSetFirstName() {
        Equals name = new Equals();
        name.setFirstName("Jane");
        
        assertEquals("First name should be set to Jane", "Jane", name.getFirstName());
    }

    @Test
    public void testSetFamilyName() {
        Equals name = new Equals();
        name.setFamilyName("Smith");
        
        assertEquals("Family name should be set to Smith", "Smith", name.getFamilyName());
    }

    @Test
    public void testGetFullName() {
        Equals name = new Equals("Alice", "Wonderland");
        
        assertEquals("Full name should be Alice Wonderland", "Alice Wonderland", name.getFullName());
    }

    @Test
    public void testEqualsTrue() {
        Equals name1 = new Equals("Emma", "Stone");
        Equals name2 = new Equals("Emma", "Stone");
        
        assertTrue("Objects with the same state should be equal", name1.equals(name2));
    }

    @Test
    public void testEqualsFalseDifferentNames() {
        Equals name1 = new Equals("Harry", "Potter");
        Equals name2 = new Equals("Harry", "Styles");
        
        assertFalse("Objects with different family names should not be equal", name1.equals(name2));
    }
    
    @Test
    public void testEqualsFalseDifferentFirstName() {
        Equals name1 = new Equals("Harry", "Potter");
        Equals name2 = new Equals("James", "Potter");
        
        assertFalse("Objects with different first names should not be equal", name1.equals(name2));
    }

    @Test
    public void testEqualsNull() {
        Equals name1 = new Equals("Emma", "Stone");
        Equals name2 = null;
        
        assertFalse("Should return false when comparing to null", name1.equals(name2));
    }

    @Test
    public void testEqualsDifferentClass() {
        Equals name1 = new Equals("Emma", "Stone");
        String str = "Not an Equals object";
        
        assertFalse("Should return false when comparing to a different class", name1.equals(str));
    }
}
