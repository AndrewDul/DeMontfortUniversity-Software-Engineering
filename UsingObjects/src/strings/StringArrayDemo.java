package strings;
import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
//		String[] fruit = new String[6];
//		fruit[0]="Grape";
//		fruit[1]="Banana";
//		fruit[2]="Strawberry";
//		fruit[3]="Dragonfruit";
//		fruit[4]="Papaya";
//		fruit[5]="Lychee";
		
		String[] fruit = {"Grape", "Banana", "Strawberry", "Dragonfruit", "Papaya", "Lychee"};
		
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Would you like to print the fruit names in lowercase or uppercase?\n1. Uppercase\n2. Lowercase\n");		int option = sc.nextInt();
        sc.nextLine();  // Clear the buffer
        
        switch (option) {
		case 1 ->{
			for(int i=0; i < fruit.length; i++) {
				System.out.println(fruit[i].toUpperCase());
			}
		}
		case 2 ->{
			for(int i=0; i < fruit.length; i++) {
				System.out.println(fruit[i].toLowerCase());
			}
		}
		
		
		
		default -> System.out.println("No valid option selected");
		
		}
		
		

	}

}
