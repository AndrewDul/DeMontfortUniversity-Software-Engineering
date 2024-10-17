package lib;

/**
 * Represents an order line containing a product id, unit price, and quantity.
 * The cost of the order line is calculated as unit price * quantity.
 * 
 * @author Andrew
 * @version 1.0
 */
public class OrderLine {
    // Fields
    private String id;
    private int unitPrice; // price in pence
    private int quantity;

    // Default constructor
    public OrderLine() {
        this.id = "";
        this.unitPrice = 0;
        this.quantity = 0;
    }

    // Custom constructor
    public OrderLine(String id, int unitPrice, int quantity) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // Getters
    public String getId() {
        return id;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the total cost (unit price * quantity)
    public int getCost() {
        return unitPrice * quantity;
    }

    // Overriding toString to return a string representation of the object
    @Override
    public String toString() {
        return "OrderLine:[id=" + id + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
    }

    // Overriding equals method to compare two OrderLine objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderLine other = (OrderLine) obj;
        return unitPrice == other.unitPrice && quantity == other.quantity && id.equals(other.id);
    }
}
