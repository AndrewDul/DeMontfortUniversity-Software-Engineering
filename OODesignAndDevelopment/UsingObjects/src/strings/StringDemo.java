package strings;
import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		//creates a String literal
		String myName = "Wayne Rooney";	
		
		//declares a variable of type char
		char c;
		
		//prints out the value of the String literal
		System.out.println(myName);
		
		//invokes the charAt method on the String literal object "myName" passing
		//the parameter value 3 and assigning the returned character to "c"
		c = myName.charAt(3);
		
		//concatenates the character to a String literal and prints it
		System.out.println("4th character is: " + c);

		//concatenates the int value returned by the length method
		//to another String literal and prints it.
		System.out.println("Length is: " + myName.length());		

		//invokes the endsWith method, passing the parameter value "ney"
		//and evaluates the boolean value returned
		
		if (myName.endsWith("ney") ) {
			System.out.println(myName + " ends with \"ney\" ");
		} else { 
			System.out.println(myName + " does not end with \"ney\" ");
		}

		System.out.println(myName.toUpperCase());
		
		System.out.println(myName.indexOf("e"));
		
		System.out.println("\n");
		
		for(int i=0; i<myName.length(); i++) {
			System.out.println(myName.charAt(i));
		}
		
 /// Additional String methods examples
        
		 // toUpperCase(): Converts all letters in the string to uppercase
        String userInput = "sample text";
        String upperCaseResult = userInput.toUpperCase();
        System.out.println("Uppercase result: " + upperCaseResult);  

        // replace(char oldChar, char newChar): Replaces all occurrences of 'p' with 'b'
        String fruitName = "apple";
        String replacedFruitName = fruitName.replace('p', 'b');
        System.out.println("Replaced result: " + replacedFruitName);  

        // substring(int beginIndex, int endIndex): Extracts a substring from index 0 to 5
        String sentence = "hello universe";
        String subText = sentence.substring(6, 14);  
        System.out.println("Substring result: " + subText);  

        // indexOf(String str): Returns the index of the first occurrence of "door"
        String phrase = "open the door";
        int indexPosition = phrase.indexOf("door");
        System.out.println("Index of 'door': " + indexPosition);  


        
        /// Interactive application using Scanner
		
		Scanner sc = new Scanner(System.in);  
		
		
	
		 boolean menu = true;

	        
		// ASCII art for MENU
	        String asciiMenu = """
	               \t __  __ ______ _   _ _    _  
	                \t|  \\/  |  ____| \\ | | |  | | 
	                \t| \\  / | |__  |  \\| | |  | | 
	                \t| |\\/| |  __| | . ` | |  | | 
	                \t| |  | | |____| |\\  | |__| | 
	                \t|_|  |_|______|_| \\_|\\____/  
	                """;

	        do {
	            System.out.println(asciiMenu);  // Print ASCII MENU title

	            // Print the menu inside a border of hyphens
	            System.out.println("----------------------------------------------");
	            System.out.println("| Please select one of the following options: |");
	            System.out.println("----------------------------------------------");
	            System.out.println("| 1 -> Show your text                        |");
	            System.out.println("| 2 -> Show length of your text              |");
	            System.out.println("| 3 -> Convert your text to uppercase        |");
	            System.out.println("| 4 -> Convert your text to lowercase        |");
	            System.out.println("| 5 -> Show the character at a specific index|");
	            System.out.println("| 6 -> Find the position of a specific char  |");
	            System.out.println("| 7 -> Exit                                  |");
	            System.out.println("----------------------------------------------");

	            System.out.print("Enter your choice: ");
	            int option = sc.nextInt();
	            sc.nextLine();  // Clear the buffer

	            if (option == 7) {
	            	
	                // Exit option
	                System.out.println("Exiting program... Goodbye!");
	                break;  // End the loop and program
	            }

	            System.out.print("Provide some text: ");
	            String text = sc.nextLine();  // User inputs some text

	            switch (option) {
	                case 1 -> System.out.println("Your text: " + text);
	                case 2 -> System.out.println("Length of your text: " + text.length());
	                case 3 -> System.out.println("Your text in uppercase: " + text.toUpperCase());
	                case 4 -> System.out.println("Your text in lowercase: " + text.toLowerCase());
	                case 5 -> {
	                    System.out.print("Enter the index (0 to " + (text.length() - 1) + "): ");
	                    int index = sc.nextInt();
	                    sc.nextLine();  // Clear the buffer
	                    if (index >= 0 && index < text.length()) {
	                        System.out.println("Character at index " + index + " is: " + text.charAt(index));
	                    } else {
	                        System.out.println("Invalid index.");
	                    }
	                }
	                case 6 -> {
	                    System.out.print("Enter the character to find its position: ");
	                    char ch = sc.next().charAt(0);
	                    sc.nextLine();  // Clear the buffer
	                    int position = text.indexOf(ch);
	                    if (position != -1) {
	                        System.out.println("Character '" + ch + "' found at index: " + position);
	                    } else {
	                        System.out.println("Character '" + ch + "' not found in your text.");
	                    }
	                }
	                default -> System.out.println("Wrong Option. Please choose a valid option.");
	            }

	            // Ask if the user wants to continue
	            System.out.println("-------------------------------------------------");
	            System.out.print("Do you want to continue? (yes/no): ");
	            String continueOption = sc.nextLine().toLowerCase();

	            while (!continueOption.equals("yes") && !continueOption.equals("no")) {
	                System.out.print("Invalid input. Please enter 'yes' or 'no': ");
	                continueOption = sc.nextLine().toLowerCase();
	            }

	            if (continueOption.equals("no")) {
	                menu = false;
	                System.out.println("Exiting program... Goodbye!");
	            }

	        } while (menu);  

	        sc.close(); 
	    }
	}