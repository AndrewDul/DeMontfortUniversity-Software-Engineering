package main;

import lib.OrderLine;
import java.util.ArrayList;
import java.util.List;

public class OrderListDemo {

    public static void main(String[] args) {
        // Create an ArrayList of type OrderLine
        List<OrderLine> orders = new ArrayList<>();

        // Add several OrderLine objects to the ArrayList
        orders.add(new OrderLine("Milk", 100, 30));  // Price: 100 cents, Quantity: 30
        orders.add(new OrderLine("Bread", 150, 10)); // Price: 150 cents, Quantity: 10
        orders.add(new OrderLine("Butter", 200, 5)); // Price: 200 cents, Quantity: 5

        // Variables to hold the total cost and total number of items
        int totalCost = 0;
        int totalItems = 0;

        // For-each loop to output each OrderLine and calculate the total cost
        for (OrderLine order : orders) {
            System.out.println("Order: " + order.getId() + ", Unit Price: " + order.getUnitPrice() + 
                               ", Quantity: " + order.getQuantity());
            totalCost += order.getUnitPrice() * order.getQuantity(); // Calculate the cost
            totalItems++;
        }

        // Calculate and output the total cost, average cost per order line, and total number of lines
        System.out.println("Total cost of the order: " + totalCost + " cents");
        System.out.println("Average cost per order line: " + (totalCost / totalItems) + " cents");
        System.out.println("Total number of order lines: " + totalItems);

        // Using a Stream pipeline to calculate the total cost
        int totalCostWithStream = orders.stream()
                .mapToInt(order -> order.getUnitPrice() * order.getQuantity()) // Mapping to cost
                .sum(); // Summing the costs

        System.out.println("Total cost using stream: " + totalCostWithStream + " cents");
    }
}
