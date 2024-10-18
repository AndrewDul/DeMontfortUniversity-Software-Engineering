package main;

import lib.Module;

public class ModuleDemo {

    public static void main(String[] args) {
        // Creating several Module objects
        Module module1 = new Module("CTEC2602", "OO Development", 60);
        Module module2 = new Module("CTEC2901", "Data Structures", 70);
        Module module3 = new Module();

        // Printing details of the modules
        System.out.println(module1.toString());
        System.out.println(module2.toString());
        System.out.println(module3.toString());

        // Modifying the weightings
        module1.setExamWeight(40);
        System.out.println("After modifying exam weight of module1:");
        System.out.println(module1.toString());
    }
}
