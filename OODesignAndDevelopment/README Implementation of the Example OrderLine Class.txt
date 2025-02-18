
Implementation of the Example OrderLine Class



public class OrderLine {

    // Attributes (fields)

    private String id;
    private int unitPrice;
    private int quantity;

    // Default constructor
    public OrderLine() {
        this.id = "000";
        this.unitPrice = 0;
        this.quantity = 1;
    }


    // Constructor with parameters
    public OrderLine(String id, int unitPrice, int quantity) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }



    // Getter for unit price
    public int getUnitPrice() {
        return unitPrice;
    }



    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    // Method to calculate total cost
    public int getCost() {
        return unitPrice * quantity;
    }



    // Method to provide a string representation of the object
    @Override
    public String toString() {
        return "OrderLine[id=" + id + ", unitPrice=" + unitPrice + ", quantity=" +           	quantity +"]";
    }



    // Method to compare objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        OrderLine orderLine = (OrderLine) obj;
        return unitPrice == orderLine.unitPrice &&
               quantity == orderLine.quantity &&
               id.equals(orderLine.id);
    }
}







Typical elements of a class:

Default Constructor:
This creates an object with default values. For example, in the OrderLine class, the default constructor might initialize unitPrice to 0 and quantity to 1.


Constructor with Parameters:
This creates an object with values provided by the user. In our example, the constructor can accept id, unitPrice, and quantity as parameters, allowing objects to be created with specific data from the start.


Getters and Setters:
A getter is a method that allows access to a field’s value (e.g., getQuantity() returns the number of ordered products).


A setter is a method that allows the value of a field to be set (e.g., setQuantity(int q) sets the number of ordered products).



toString() Method:
Returns a string representation of the object. In the OrderLine class, the toString() method could return a string in the format OrderLine[id="001", unitPrice=500, quantity=3].



equals(Object obj) Method:
Enables comparing objects for equality. For example, in the OrderLine class, two objects can be compared based on their id and unitPrice.










