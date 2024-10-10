package main;

import lib.Date;
import lib.Gender;
import lib.Name;
import lib.Person;

public class PersonDemo {
    
    public static void main(String[] args) {
    
        /* Create a default instance of Person.
         Set the name, date-of-birth and gender.
         Display all the person’s details (i.e. toString())
         
         Output the full name of the person.
         Output the first name of the person.
         Output the date-of-birth of the person.
         Output the month the person was born.
         Change the person’s family name.
         
         Create a male Person (e.g. David Beckham) using the general constructor.
         Change the person’s first name to female name (e.g. Victoria).
         Change the person’s gender to female.
         
         Work out how many years old the person is.
         */

        Person p = new Person();
        System.out.println(p);

        p.setName(new Name("Cheryl", "Cole"));
        p.setDob(new Date(25,11,1982));
        p.setGender(Gender.FEMALE);
        System.out.println(p);

        System.out.println("Full name is " + p.getName().getFullName());
        System.out.println("First name is " + p.getName().getFirstName());
        System.out.println("Dob is " + p.getDob().getDateString());
        System.out.println("Month of birth=" + p.getDob().getMonth());

        //Person p1 = new Person(new Name("Ashley", "Cole"), new Date(15,7,1980), true);
        //or
        Name n1 = new Name("David", "Beckham");
        Date d1 = new Date(15,7,1976);
        Person p1 = new Person(n1, d1, Gender.MALE);
       
        p1.getName().setFirstName("Victoria");
        p1.setGender(Gender.FEMALE); //change gender to female
        System.out.println(p1);

        //Work out how many years old the person is.
        Date d = p1.getDob();
        Date today = new Date(25,11,2010);

        
        int years = today.getYear()-d.getYear();
        if (today.getMonth()<d.getMonth()) years--;
        else if (today.getMonth()==d.getMonth() && today.getDay()<d.getDay()) years--;

        System.out.println(p1.getName().getFullName() + " is " + years +  " years old" );
        
    }
    
}
