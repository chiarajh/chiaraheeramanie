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

public class SeaDream extends DreamBound {

    // Constructor to set the dream name and link it to the player
    public SeaDream(Player player) {
        super("Sea Dream", player);
    }

    @Override
    public boolean startChallenge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are lost in the Sea Dream. Your compass is broken."); // Intro to the challenge
        System.out.println("Collect the correct shell to rebuild it: Conch, Starfish, or Pebble."); // Options for player
/*
Title: Java User Input
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_user_input.asp
         */
        String choice = sc.nextLine(); // Store player input
        if (choice.equalsIgnoreCase("Conch")) { // Check if correct shell
            System.out.println("The conch shell glows and fixes your compass!"); // Success message
            player.getInventory().addItem("Conch Shell"); // Reward item to player
            return true; // Challenge completed
        } else {
            System.out.println("The shell crumbles into sand... You remain lost."); // Failure message
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
