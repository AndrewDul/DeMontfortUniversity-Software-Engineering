package lib;

/**
 * A name has a first name and a family name.
 * There is an option to produce a full name by combining these.
 * 
 * @author Luke
 */
public class Equals {

	//Fields
	private String firstName;
	private String familyName;

	
	//Constructors
	public Equals() {
		firstName = "";
		familyName = "";
	}
	
	public Equals(String firstName, String familyName) {
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
	
	public boolean equals(Object obj) {
		
	// compare first & family names using String equals() method if
	//obj passed in is instance of Name class.
		return (obj instanceof Equals other)
				&& this.familyName.equals(other.familyName)
				&& this.firstName.equals(other.firstName);
	}
	
	
//	@Override
//	public String toString() {
//		return "Name:[firstName=" + firstName + ", familyName=" + familyName + "]";
//	}
}
