package main;

import lib.Equals;
public class EqualsDemo {

	public static void main(String[] args) {
		
//		String a = new String("hello");
//		String b = new String("hello");
//		
//		System.out.println("a==b is: " + (a==b));
//		System.out.println("a.equals(b) is: " + a.equals(b));

		
		Equals n = new Equals("Joe", "Bloggs");
		Equals n1 = new Equals("Joe", "Bloggs");
		System.out.println("n==n1 is: " + (n==n1));
		System.out.println("n.equals(n1) is: " + n.equals(n1));

	}

}
