/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceminingadventure;

/**
 *
 * @author Chiara
 */
public class Alien {
    private String type;
    private int hp;

    public Alien(String type, int hp) {
        this.type = type;
        this.hp = hp;
    }
// Title: Java Constructors
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_constructors.asp
    public String getType() { return type; }
    public int getHp() { return hp; }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }
}
// Title: Java Encapsulation and Getters and Setters
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_encapsulation.asp

