/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceminingadventure;

/**
 *
 * @author Chiara
 */
public class GameReport {
    private CargoShip ship;

    public GameReport(CargoShip ship) {
        this.ship = ship;
    }
// Title: Java Constructors
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_constructors.asp 

    public void printReport() {
        System.out.println("\n--- GAME REPORT ---");
        System.out.println("Ship Name: " + ship.getName());
        System.out.println("Ship HP: " + ship.getHp());
        System.out.println("Ship Fuel: " + ship.getFuel());
        System.out.println("Resources Collected:");
        for (Resource r : ship.getCargo()) {
            if (r != null) {
                System.out.println("- " + r.getQuantity() + " " + r.getName());
            }
        }
    }
}
// Title: Java void Keyword
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/ref_keyword_void.asp

