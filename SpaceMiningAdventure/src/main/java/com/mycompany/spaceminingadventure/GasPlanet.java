/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceminingadventure;

/**
 *
 * @author Chiara
 */
public class GasPlanet extends Planet {
    private Resource resource;

    public GasPlanet(String name, Resource resource) {
        super(name);
        this.resource = resource;
    }
// Title: Java Constructors
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_constructors.asp
    public Resource getResource() { return resource; }
}

// Title: Java Encapsulation and Getters and Setters
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_encapsulation.asp