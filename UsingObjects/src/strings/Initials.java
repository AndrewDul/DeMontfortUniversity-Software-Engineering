package strings;

public class Initials {

	public static void main(String[] args) {
		String name = "David Beckham";
		
		char firstInitial = name.charAt(0);
		
		int spaceIndex = name.indexOf(" ");
		
		char seciondInitial = name.charAt(spaceIndex+1);
		
		System.out.println("Initial: " + firstInitial + seciondInitial);

	}

}
