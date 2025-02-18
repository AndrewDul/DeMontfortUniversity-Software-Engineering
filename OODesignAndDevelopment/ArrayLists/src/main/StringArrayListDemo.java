package main;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class StringArrayListDemo {
    public static void main(String[] args) {
        // a) Create an ArrayList of type String
        List<String> words = new ArrayList<>(); 
        
        // b) Add some String data
        words.add("Hello");
        words.add("World");
        words.add("Java");
        
        // Overwrite the second element
        words.set(1, "Programming");

        // Remove the third element
        words.remove(2);

        // c) Use a for-each loop to output each element in uppercase
        System.out.println("Using for-each loop (uppercase):");
        for (String word : words) {
            System.out.println(word.toUpperCase());
        }

        // Use forEach method with lambda to output each element in lowercase
        System.out.println("\nUsing forEach method (lowercase):");
        words.forEach(word -> System.out.println(word.toLowerCase()));

        // d) Change to LinkedList implementation
        List<String> linkedWords = new LinkedList<>(words);
        System.out.println("\nContents of the LinkedList:");
        
        // linkedWords.forEach(word -> System.out.println(word));  //Printing contents of LinkedList
        
        linkedWords.forEach(System.out::println); // Printing contents of LinkedList
        
     // This is a method reference that points to the println method in the System.out class.
     // It is shorthand for a lambda expression that calls System.out.println(x) for each element in the collection.
     // The method reference System.out::println is passed as an argument to the forEach method, which will print each element.


    }
}
