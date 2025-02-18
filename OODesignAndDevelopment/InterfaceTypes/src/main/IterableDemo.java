package main;

import lib.polymorphism.MultipleDice;
import lib.polymorphism.Die;

public class IterableDemo {
    public static void main(String[] args) {
        // Create a MultipleDice instance with 3 Die objects
        MultipleDice multipleDice = new MultipleDice(3);

        // Using a for-each loop to iterate over each Die in MultipleDice
        System.out.println("Using for-each loop:\n");
        for (Die die : multipleDice) {
            System.out.println(die.toString());
        }

        // Using the forEach method to iterate over each Die in MultipleDice
        System.out.println("\n\nUsing forEach method:\n");
        multipleDice.forEach(die -> System.out.println(die.toString()));
    }
}