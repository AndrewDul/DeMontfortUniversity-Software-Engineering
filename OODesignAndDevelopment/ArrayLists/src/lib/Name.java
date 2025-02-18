package lib;

/**
 * A name has a first name and a family name.
 * There is an option to produce a full name by combining these.
 * 
 * @author Luke
 */
public class Name {

	//Fields
	private String firstName;
	private String familyName;

	
	//Constructors
	public Name() {
		firstName = "";
		familyName = "";
	}
	
	public Name(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}

	
	//Methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getFullName() {
		if (firstName.equals("") && familyName.equals("")) {
			return "";
		} else {
			return firstName + " " + familyName;
		}
	}
	
	@Override
	public String toString() {
		return "Name:[firstName=" + firstName + ", familyName=" + familyName + "]";
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if they are the same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Ensure they are of the same class
        Name name = (Name) obj; // Cast the object to a Name type
        return firstName.equals(name.firstName) && familyName.equals(name.familyName); // Compare both fields
    }
}
