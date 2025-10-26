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

public class JungleDream extends DreamBound {

    // Constructor to set the dream name and link the player
    public JungleDream(Player player) {
        super("Jungle Dream", player);
    }

    // Method to start the jungle dream challenge
    @Override
    public boolean startChallenge() {
        Scanner sc = new Scanner(System.in); // Scanner to read player input
        System.out.println("You are in the Jungle Dream. A monkey stole your map!");
        System.out.println("Solve this riddle to get it back:");
        System.out.println("I speak without a mouth and hear without ears. What am I?");
        /*
Title: Java User Input
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_user_input.asp
         */
        System.out.println("Hint: It's something that repeats what you say.");

        String answer = sc.nextLine(); // Read the player's answer
        if (answer.equalsIgnoreCase("echo")) { // Check if answer is correct
            System.out.println(" Correct! The monkey returns your map.");
            player.getInventory().addItem("Jungle Map"); // Add map to inventory
            return true; // Challenge passed
        } else {
            System.out.println(" Wrong! The monkey runs away.");
            return false; // Challenge failed
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
