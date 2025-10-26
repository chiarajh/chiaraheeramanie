/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceminingadventure;

/**
 *
 * @author Chiara
 */
public class Planet {
    private String name;
    private boolean visited;

    public Planet(String name) {
        this.name = name;
        this.visited = false;
    }
// Title: Java Constructors
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_constructors.asp
    public String getName() { return name; }
    public boolean isVisited() { return visited; }
    public void visit() { visited = true; }
}
// Title: Java Encapsulation and Getters and Setters
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_encapsulation.asp
