package lib;


/**
 * A Person has a name, date of birth, and gender.
 * This example shows how a Person is a Composition of Name and Date objects.
 * @author lz, la
 */
public class Person {
    
    private Name name;
    private Date dob;
    private Gender gender;
    
    /** Creates a new instance of Person, using default name and date values. 
     * The default gender is female. */
    public Person() {
        name = new Name();
        dob = new Date();
        gender = Gender.FEMALE;
    }
    
    /** Creates a new instance of Person, with the given values. */
    public Person(Name name, Date dob, Gender gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }
 
    public void setName(Name name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public Gender getGender() {
        return gender;
    }
    
    public String toString() {
        return "Person:[name=" + name 
                + ", dob=" + dob
                + ", gender=" + gender + "]";
    }
}
