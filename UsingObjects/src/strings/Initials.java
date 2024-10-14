package strings;
import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {
		String name = "David Beckham";
		
		char firstInitial = name.charAt(0);
		
		int spaceIndex = name.indexOf(" ");
		
		char seciondInitial = name.charAt(spaceIndex+1);
		
		System.out.println("Initial: " + firstInitial + seciondInitial);
		
		// Convert initials to lowercase
        char firstLowerCaseInitial = Character.toLowerCase(firstInitial);
        char secondLowerCaseInitial = Character.toLowerCase(seciondInitial);
		
		String emailform= "@email.dmu.ac.uk.";
		System.out.println("E-mail: "+ firstLowerCaseInitial + secondLowerCaseInitial + emailform);
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("------------------------------------------------------------");
		System.out.println("Provide your fullname: ");
		
		String text = sc.nextLine();
		
		char firstInitialUser = text.charAt(0);
		
		int spaceIndexUser = text.indexOf(" ");
		
		char secondInitialUser = text.charAt(spaceIndexUser+1);
		
		// Convert initials to lowercase
        char firstLowerCaseInitialUser = Character.toLowerCase(firstInitialUser);
        char secondLowerCaseInitialUser = Character.toLowerCase(secondInitialUser);
		
		System.out.println("Initial: " + firstInitialUser + secondInitialUser);
		System.out.println("Do you want to generate an e-mail?");
		String choice = sc.nextLine();
		 
		switch (choice.toLowerCase()){
		case "yes" -> System.out.println("E-mail: "+ firstLowerCaseInitialUser + secondLowerCaseInitialUser + emailform);
		
		default ->System.out.println("No email generated.");
		
		}
		
		System.out.println("------------------------------------------------------------");

		
		

	}

}
