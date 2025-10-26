/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dreambound;

/**
 *
 * @author Chiara
 */
public class DreamFactory {

    // Method to create a dream object based on the type given
    public static DreamBound createDream(String type, Player player) {
        // Use a switch statement to decide which dream to create
        switch (type) {
            case "Jungle":
                // Create a JungleDream for the player
                return new JungleDream(player);
            case "Scary":
                // Create a ScaryDream for the player
                return new ScaryDream(player);
            case "Candy":
                // Create a CandyDream for the player
                return new CandyDream(player);
            case "Sea":
                // Create a SeaDream for the player
                return new SeaDream(player);
            default:
                // Return null if the type does not match any dream
                return null;
        }
    }
}
/*
Title: Java Switch Statements
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_switch.asp
 */
