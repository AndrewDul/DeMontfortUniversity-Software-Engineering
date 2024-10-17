package main;

import lib.OrderLine;

public class OrderLineApp {

    public static void main(String[] args) {
        // Creating several OrderLine objects
        OrderLine order1 = new OrderLine("Baked Beans", 55, 7);
        OrderLine order2 = new OrderLine("Tuna 4 pack", 399, 2);
        OrderLine order3 = new OrderLine("Milk", 99, 3);

        // Printing details of the order lines
        System.out.println(order1.toString());
        System.out.println(order2.toString());
        System.out.println(order3.toString());

        // Printing the cost of the orders
        System.out.println("Total cost of order 1: " + order1.getCost());
        System.out.println("Total cost of order 2: " + order2.getCost());
        System.out.println("Total cost of order 3: " + order3.getCost());
    }
}
