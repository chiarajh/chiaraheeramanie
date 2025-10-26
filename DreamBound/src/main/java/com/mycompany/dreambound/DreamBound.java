/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.dreambound;

/**
 *
 * @author Chiara
 */
public abstract class DreamBound {

    /*
Title: Java Abstract Classes in Java
Author: GeeksforGeeks
Date: 2025
Code Version: 1
Availability: https://www.geeksforgeeks.org/java/abstract-classes-in-java/
     */

    // Name of the dream
    protected String name;
    // The player associated with this dream
    protected Player player;

    // Constructor
    public DreamBound(String name, Player player) {
        this.name = name;
        this.player = player;
    }

    /*
Title: Java Constructors
Author: W3Schools
Date: 2025
Code Version: 1
Availability: https://www.w3schools.com/java/java_constructors.asp
     */

    // Getter 
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

    // Abstract method: every dream class must implement its own challenge
    public abstract boolean startChallenge();
}
