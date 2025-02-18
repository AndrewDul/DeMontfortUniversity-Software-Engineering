package textio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameProcessor {

    public static void main(String[] args) {
        ArrayList<Name> nameList = new ArrayList<>();

        try {
            // Open the "names.txt" file for reading
            Scanner in = new Scanner(new File("names.txt"));
            
            while (in.hasNextLine()) {
                String line = in.nextLine().trim(); // Read each line and remove extra spaces

                // Split the line into two parts: first name and family name
                String[] nameParts = line.split(" ");
                if (nameParts.length == 2) {
                    String firstName = nameParts[0];
                    String familyName = nameParts[1];

                    // Create a Name object and add it to the list
                    nameList.add(new Name(firstName, familyName));
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }

            in.close();

            // Display the list of full names
            for (Name n : nameList) {
                System.out.println(n.getFullName());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'names.txt' was not found.");
            e.printStackTrace();
        }
    }
}
