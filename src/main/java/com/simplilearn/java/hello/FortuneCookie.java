package com.simplilearn.java.hello;

import java.util.Random;
import java.util.Scanner;

public class FortuneCookie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] fortunes = {
            "You will have a great day!",
            "Good things are coming your way.",
            "A surprise is waiting for you.",
            "Dream big and dare to fail.",
            "Today is a lucky day for you.",
            "Smile, and good fortune will follow.",
           
        };

        System.out.println( "You will find happiness with a new love.");
        System.out.print("Stick with your wife.");

        // Wait for the user to press Enter
        scanner.nextLine();

        // Generate a random fortune
        int randomIndex = random.nextInt(fortunes.length);
        String fortune = fortunes[randomIndex];

        System.out.println("\nYour fortune: " + fortune);

        // Close the scanner
        scanner.close();
    }
}
