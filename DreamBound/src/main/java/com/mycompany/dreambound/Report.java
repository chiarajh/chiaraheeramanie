/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dreambound;

/**
 *
 * @author Chiara
 */
public class Report {

    // Method to generate a report for the player after a dream challenge
    public static void generate(Player player, DreamBound dream, boolean success) {
        System.out.println("\n===== DREAMBOUND REPORT ====="); // Report header
        System.out.println("Player: " + player.getName()); // Show the player's name
        System.out.println("Dream World: " + dream.getName()); // Show which dream the player was in
        System.out.println("Challenge Status: " + (success ? "Completed " : "Failed ")); // Show if challenge was successful
        player.getInventory().displayItems(); // Display items collected in inventory
        System.out.println("============================="); // Report footer
    }
}
/*
Title: Java void Keyword
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/ref_keyword_void.asp
 */
