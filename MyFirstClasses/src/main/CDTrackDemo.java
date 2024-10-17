package main;

import lib.CDTrack;

public class CDTrackDemo {

    public static void main(String[] args) {
        // Create two CDTrack objects
        CDTrack track1 = new CDTrack("We Are the Champions", "Queen", 218);
        CDTrack track2 = new CDTrack("We Are the Champions", "Queen", 218);

        // Compare using equals (should return false as the objects are different instances)
        System.out.println("Comparing track1 and track2: " + track1.equals(track2));

        // Display the string representation of the objects
        System.out.println("track1: " + track1);
        System.out.println("track2: " + track2);
    }
}
