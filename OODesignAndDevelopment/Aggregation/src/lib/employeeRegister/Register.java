package lib.employeeRegister;

import java.util.ArrayList;

/**
 * Register class represents an aggregation of names.
 * It allows adding, removing, and managing names with a fixed room capacity.
 * 
 * @author Andrew
 * 
 */
public class Register {
    private ArrayList<Name> names;  // List of names in the register
    private int roomCapacity;       // Room capacity for the register

    /**
     * Default constructor with a room capacity of 30.
     */
    public Register() {
        this.roomCapacity = 30;
        this.names = new ArrayList<>();
    }

    /**
     * Custom constructor allowing the room capacity to be set.
     * 
     * @param roomCapacity The maximum number of names the register can hold.
     */
    public Register(int roomCapacity) {
        this.roomCapacity = roomCapacity;
        this.names = new ArrayList<>();
    }

    /**
     * Returns the current number of names in the register.
     * 
     * @return The size of the register.
     */
    public int registerSize() {
        return names.size();
    }

    /**
     * Returns the room capacity of the register.
     * 
     * @return The room capacity.
     */
    public int getCapacity() {
        return roomCapacity;
    }

    /**
     * Adds a name to the register if the capacity allows.
     * 
     * @param name The name to be added.
     */
    public void addName(Name name) {
        if (names.size() < roomCapacity) {
            names.add(name);
        } else {
            System.out.println("Cannot add name, room capacity exceeded.");
        }
    }

    /**
     * Adds multiple names to the register if the capacity allows.
     * 
     * @param newNames A list of names to add.
     */
    public void addNames(ArrayList<Name> newNames) {
        if (names.size() + newNames.size() <= roomCapacity) {
            names.addAll(newNames);
        } else {
            System.out.println("Cannot add names, room capacity will be exceeded.");
        }
    }

    /**
     * Clears all the names from the register.
     */
    public void clearRegister() {
        names.clear();
    }

    /**
     * Checks if the register is empty.
     * 
     * @return True if the register is empty, false otherwise.
     */
    public boolean isRegisterEmpty() {
        return names.isEmpty();
    }

    /**
     * Removes a name from the register by index.
     * 
     * @param index The index of the name to be removed.
     */
    public void removeName(int index) {
        if (index >= 0 && index < names.size()) {
            names.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    /**
     * Searches the register for a family name (case-insensitive).
     * 
     * @param familyName The family name to search for.
     * @return True if a matching family name is found, false otherwise.
     */
    public boolean searchRegisterByFamilyName(String familyName) {
        for (Name name : names) {
            if (name.getFamilyName().equalsIgnoreCase(familyName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Counts the number of first names that end with the given character.
     * 
     * @param c The character to match.
     * @return The number of occurrences.
     */
    public int countFirstNameOccurrences(char c) {
        int count = 0;
        for (Name name : names) {
            if (name.getFirstName().endsWith(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }

    /**
     * Retrieves a name at a specific index.
     * 
     * @param index The index to retrieve.
     * @return The name at the specified index.
     */
    public Name getNameAt(int index) {
        if (index >= 0 && index < names.size()) {
            return names.get(index);
        }
        return null;
    }

    /**
     * Returns a string representation of the register.
     * 
     * @return A string of all names in the register.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Name name : names) {
            sb.append(name.getFullName()).append("\n");
        }
        return sb.toString();
    }
}
