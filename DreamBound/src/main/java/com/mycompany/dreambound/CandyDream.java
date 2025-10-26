/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dreambound;

/**
 *
 * @author Chiara
 */
import java.util.Scanner;

public class CandyDream extends DreamBound {

    // Constructor 
    public CandyDream(Player player) {
        super("Candy Dream", player);
    }

    @Override
    public boolean startChallenge() {
        Scanner sc = new Scanner(System.in);

        // Welcome message for the player when they enter Candy Land
        System.out.println("You are in Candy Land! A chocolate bridge blocks your way.");
        // Instructions for the challenge, player must pick a candy
        System.out.println("Guess the correct candy to step on: Marshmallow, Gummy, or Licorice.");

        /*
Title: Java User Input
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_user_input.asp
         */
        // Hint to help the player make the correct choice
        System.out.println("Hint: The candy that is chewy and bouncy might be safe to step on.");

        // Take the player's input
        String choice = sc.nextLine();

        // Check if the player chose the correct candy
        if (choice.equalsIgnoreCase("Gummy")) {
            System.out.println("Sweet! The gummy path is safe and chewy.");
            // Reward the player by adding a Candy Gem to their inventory
            player.getInventory().addItem("Candy Gem");
            return true;
        } else {
            // Player chose wrong candy, challenge failed
            System.out.println("Oh no! The bridge collapses into syrup!");
            return false;
        }
    }
}
/*
Title: Java Conditions and If Statements
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_conditions.asp
*/
