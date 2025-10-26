/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dreambound;

/**
 *
 * @author Chiara
 */
public class Inventory {

    // Array to store items in the inventory
    private String[] items;
    // Keeps track of how many items are currently in the inventory
    private int count;

    // Constructor to initialize the inventory with space for 10 items
    public Inventory() {
        items = new String[10];
        count = 0;
    }

    // Method to add an item to the inventory
    public void addItem(String item) {
        if (count < items.length) { // Only add if there is space
            items[count++] = item;
        }
    }

    // Method to display all items in the inventory
    public void displayItems() {
        System.out.println("Inventory:");
        if (count == 0) { // Check if inventory is empty
            System.out.println("- (empty)");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("- " + items[i]); // Display each item
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

    // Method to get an item at a specific index
    public String getItem(int index) {
        if (index >= 0 && index < count) { // Make sure index is valid
            return items[index];
        }
        return null; // Return null if index is invalid
    }

    // Method to get the current number of items in the inventory
    public int getCount() {
        return count;
    }
}
/*
Title: Java Encapsulation and Getters and Setters
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_encapsulation.asp
 */
