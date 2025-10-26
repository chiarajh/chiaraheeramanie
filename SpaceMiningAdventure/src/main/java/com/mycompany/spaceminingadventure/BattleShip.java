/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceminingadventure;

/**
 *
 * @author Chiara
 */
public class BattleShip extends SpaceShip {
    private int attackPower;

    public BattleShip(String name, int hp, int fuel, int attackPower) {
        super(name, hp, fuel);
        this.attackPower = attackPower;
    }
// Title: Java Constructors
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_constructors.asp
    public int attack(Alien alien) {
        alien.takeDamage(attackPower);
        System.out.println(getName() + " attacks " + alien.getType() + " for " + attackPower + " damage!");
        return attackPower;
    }
}
// Title: Java Methods Return Values
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_methods_return.asp