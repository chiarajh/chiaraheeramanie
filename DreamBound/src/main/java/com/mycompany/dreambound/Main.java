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

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read user input
        System.out.println("Welcome to DreamBound!");
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Get the player's name
/*
Title: Java User Input
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_user_input.asp
         */

        Player player = new Player(name); // Create a new player with the entered name
        DreamBound dream = DreamServer.spawnRandomDream(player); // Spawn a random dream for the player

        System.out.println("\n You have spawned in: " + dream.getName()); // Show which dream the player got
        boolean success = dream.startChallenge(); // Start the challenge and store if it was successful
/*
Title: Java Encapsulation and Getters and Setters
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_encapsulation.asp
         */
        Report.generate(player, dream, success); // Generate a report based on the player's dream and result
    }
}
