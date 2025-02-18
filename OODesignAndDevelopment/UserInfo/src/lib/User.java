package lib;

/**
 * This class represents a User with first name, last name, email, and occupation.
 * It provides methods to access and print these details.
 * 
 * @version 1.0
 * @author Andrew
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String occupation;

    /**
     * Constructs a new User with the specified first name, last name, email, and occupation.
     * 
     * @param firstName the user's first name
     * @param lastName the user's last name
     * @param email the user's email address
     * @param occupation the user's current occupation
     */
    public User(String firstName, String lastName, String email, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.occupation = occupation;
    }

    /**
     * Gets the first name of the user.
     * 
     * @return the user's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name of the user.
     * 
     * @return the user's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the email of the user.
     * 
     * @return the user's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the current occupation of the user.
     * 
     * @return the user's current occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Returns a string representation of the user, including their name, email, and occupation.
     * 
     * @return a string containing the user's information
     */
    @Override
    public String toString() {
        return "User Info: \n" +
               "First Name: " + firstName + "\n" +
               "Last Name: " + lastName + "\n" +
               "Email: " + email + "\n" +
               "Current Occupation: " + occupation;
    }
}
