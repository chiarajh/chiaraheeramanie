/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dreambound;

/**
 *
 * @author Chiara
 */
public class Player {

    private String name; // Store the player's name
    private Inventory inventory; // Each player has an inventory to hold items

    // Constructor to create a player with a name and initialize inventory
    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    /*
Title: Java Constructors
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_constructors.asp
     */

    // Getter method to access player's name
    public String getName() {
        return name;
    }

    /*
Title: Java Encapsulation and Getters and Setters
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_encapsulation.asp
     */

    // Getter method to access player's inventory
    public Inventory getInventory() {
        return inventory;
    }
    /*
Title: Java Encapsulation and Getters and Setters
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_encapsulation.asp
     */
}

/*
Title: Java Methods Return Values
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_methods_return.asp
 */
