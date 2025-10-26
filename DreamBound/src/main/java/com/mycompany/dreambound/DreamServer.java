/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dreambound;

/**
 *
 * @author Chiara
 */
import java.util.Random;

/*
Title: Java How To Generate Random Numbers
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_howto_random_number.asp
 */
public class DreamServer {

    // 2D array of dreams: {type, difficulty, description}
    private static final String[][] dreams = {
        {"Jungle", "Medium", "Navigate through the wild jungle and solve the monkey's riddle."},
        {"Scary", "Hard", "Escape the haunted house without getting caught by ghosts."},
        {"Candy", "Easy", "Collect all the sweets and avoid the sticky traps."},
        {"Sea", "Medium", "Repair the broken compass and explore the underwater world."}
    };

    // Method to spawn a random dream for a player
    public static DreamBound spawnRandomDream(Player player) {
        Random rand = new Random(); // Create a random number generator
        int index = rand.nextInt(dreams.length); // Pick a random dream row
        String[] selectedDream = dreams[index]; // Select the dream info

        String type = selectedDream[0];
        String difficulty = selectedDream[1];
        String description = selectedDream[2];

        System.out.println("DreamServer: Spawning dream -> " + type + " (Difficulty: " + difficulty + ")");
        System.out.println("Description: " + description);

        // Use DreamFactory to create the selected dream and return it
        return DreamFactory.createDream(type, player);
    }
}
/*
Title: Java How To Generate Random Numbers
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_howto_random_number.asp
*/
