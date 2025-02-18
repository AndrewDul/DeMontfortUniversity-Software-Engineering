package textio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NameProcessor2 {

    public static void main(String[] args) {
        ArrayList<Name> nameList = new ArrayList<>();

        try {
            // Open the "names2.txt" file for reading
            Scanner in = new Scanner(new File("names2.txt"));
            
            while (in.hasNextLine()) {
                String line = in.nextLine().trim();

                // Extract first and family names within angle brackets
                String[] nameParts = line.split("><");
                if (nameParts.length == 2) {
                    // Remove any remaining angle brackets
                    String firstName = nameParts[0].replace("<", "");
                    String familyName = nameParts[1].replace(">", "");

                    // Create a Name object and add it to the list
                    nameList.add(new Name(firstName, familyName));
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }

            in.close();

            // Output names with total length < 12 to "shorter_names.txt"
            PrintWriter out = new PrintWriter(new File("shorter_names.txt"));
            for (Name n : nameList) {
                String fullName = n.getFullName();
                if (fullName.length() < 12) {
                    out.println(fullName);
                }
            }

            out.close();
            System.out.println("Names with a total length of fewer than 12 characters\n have been written to 'shorter_names.txt'.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'names2.txt' was not found.");
            e.printStackTrace();
        }
    }
}
