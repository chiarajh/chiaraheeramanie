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

public class ScaryDream extends DreamBound {

    // Constructor to set the dream name and associate it with the player
    public ScaryDream(Player player) {
        super("Scary Dream", player);
    }

    @Override
    public boolean startChallenge() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" You are trapped in a haunted house!"); // Intro to the challenge
        System.out.println("Three keys lie on the table: Gold, Silver, and Rusty."); // Options to choose from
/*
Title: Java User Input
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_user_input.asp
         */
        System.out.println("Hint: The key that looks old and worn might be the one you need."); // Hint for the player

        System.out.print("Which key will open the exit door? "); // Ask for user input

        String choice = sc.nextLine(); // Store user input
        if (choice.equalsIgnoreCase("Rusty")) { // Check if correct key
            System.out.println(" The rusty key creaks... the door opens!"); // Success message
            player.getInventory().addItem("Haunted Key"); // Give item to player
            return true; // Challenge completed
        } else {
            System.out.println("The key doesn't fit. The ghosts laugh at you..."); // Failure message
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
