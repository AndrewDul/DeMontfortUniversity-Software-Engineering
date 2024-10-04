package primitives;
import java.util.Scanner;

public class MyNote {

    // Method that adds two numbers
    public static int add(int x, int y) {
        return x + y;  // Return the sum of x and y
    }
    
    // Method that subtracts two numbers
    public static int subtraction(int x, int y) {
        return x - y;  // Return the difference of x and y
    }
    
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);  
        
     
        System.out.println("Input first number:");
        int b = sc.nextInt();  
        
       
        System.out.println("Input second number:");
        int c = sc.nextInt();  
        
        sc.close();  // Closing the Scanner after input is done
        

        int addAns = add(b, c); 
        int subtractionAns = subtraction(b, c);  
        
        // Printing the results
        System.out.println("That is the sum: " + addAns);  
        System.out.println("That is the result of subtraction: " + subtractionAns); 
    }
}
