/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceminingadventure;

/**
 *
 * @author Chiara
 */
public class SpaceShip {
    private String name;
    private int hp;
    private int fuel;

    public SpaceShip(String name, int hp, int fuel) {
        this.name = name;
        this.hp = hp;
        this.fuel = fuel;
    }
// Title: Java Constructors
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_constructors.asp
    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getFuel() { return fuel; }
// Title: Java Encapsulation and Getters and Setters
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_encapsulation.asp
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    public void useFuel(int amount) {
        fuel -= amount;
        if (fuel < 0) fuel = 0;
    }
}

