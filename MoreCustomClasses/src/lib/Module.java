package lib;

/**
 * Represents a module with a code, name, exam weighting, and coursework weighting.
 * The weightings must always add up to 100%.
 * If one is changed, the other is adjusted accordingly.
 * 
 * @author Andrew
 * @version 1.0
 */
public class Module {
    // Fields
    private String code;
    private String name;
    private int examWeight; // in percentage (%)
    private int cwkWeight;  // in percentage (%)

    // Default constructor
    public Module() {
        this.code = "CTEC0000";  // Default code for modules
        this.name = "";  // Default name
        this.examWeight = 50;  // Default 50% for both exam and coursework
        this.cwkWeight = 50;
    }

    // Custom constructor with code and name
    public Module(String code, String name) {
        this.code = code;
        this.name = name;
        this.examWeight = 50;
        this.cwkWeight = 50;
    }

    // Custom constructor with code, name, and exam weight
    public Module(String code, String name, int examWeight) {
        this.code = code;
        this.name = name;
        setExamWeight(examWeight);  // Automatically adjusts cwkWeight
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getExamWeight() {
        return examWeight;
    }

    public int getCwkWeight() {
        return cwkWeight;
    }

    // Setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Setter for exam weight, adjusts coursework weight to ensure total is 100%
    public void setExamWeight(int examWeight) {
        this.examWeight = examWeight;
        this.cwkWeight = 100 - examWeight;
    }

    // Setter for coursework weight, adjusts exam weight to ensure total is 100%
    public void setCwkWeight(int cwkWeight) {
        this.cwkWeight = cwkWeight;
        this.examWeight = 100 - cwkWeight;
    }

    // Returns a textual representation of the module
    @Override
    public String toString() {
        return "Module:[code=" + code + ", name=" + name + ", examWeight=" + examWeight + ", cwkWeight=" + cwkWeight + "]";
    }



    // Checks equality between two Module objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Module other = (Module) obj;
        return code.equals(other.code) && name.equals(other.name)
               && examWeight == other.examWeight && cwkWeight == other.cwkWeight;
    }
}
