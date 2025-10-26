/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceminingadventure;

/**
 *
 * @author Chiara
 */
public class StrongAlien extends Alien {
    public StrongAlien(String type, int hp) {
        super(type, hp);
    }

    public int attack() {
        int damage = 15;
        System.out.println(getType() + " attacks for " + damage + " damage!");
        return damage;
    }
}
// Title: Java Methods Return Values
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_methods_return.asp