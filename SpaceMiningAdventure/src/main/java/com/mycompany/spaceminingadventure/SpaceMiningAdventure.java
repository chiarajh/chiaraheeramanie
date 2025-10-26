/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.spaceminingadventure;

/**
 *
 * @author Chiara
 */
import java.util.Scanner;
import java.util.Random;

public class SpaceMiningAdventure {

    public static void main(String[] args) {
        
        //Scanner 
        Scanner input = new Scanner(System.in);
// Title: Java User Input
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_user_input.asp
        
        //Random object for alien encounter
        Random rand = new Random();
// Title: Java How To Generate Random Numbers
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_howto_random_number.asp

        //cargo details
        CargoShip playerShip = new CargoShip("StarMiner", 100, 50, 5);

        //array of planets
        Planet[] planets = new Planet[2];
        planets[0] = new RockyPlanet("Mars", new Resource("Iron", 10));
        planets[1] = new GasPlanet("Jupiter", new Resource("Hydrogen", 5));

        System.out.println("=== Welcome to Space Mining Adventure! ===");

        //Loop through planet
        for (Planet currentPlanet : planets) {
            System.out.println("\nYou have arrived at " + currentPlanet.getName());
// Title: Java For Loop
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_for_loop.asp

            //Random alien encounter
            boolean encounterAlien = rand.nextBoolean();
// Title: Java Booleans
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_booleans.asp

            if (encounterAlien) {
                //Create alien randomly(weak or strong)
                Alien alien = rand.nextBoolean() ? new WeakAlien("Martian", 20) : new StrongAlien("Zorgon", 40);
                System.out.println("Alert! Alien spotted: " + alien.getType());
                System.out.println("Do you want to: 1. Fight  2. Flee");

                //player choice for fight or flee
                int choice = input.nextInt();

                if (choice == 1) {
                    //battle ship for combat
                    BattleShip fighter = new BattleShip("Defender", 80, playerShip.getFuel(), 15);
                    fighter.attack(alien); // Attack alien

                    if (alien.getHp() > 0) {
                        //Alien encounter attacks
                        int damage = (alien instanceof WeakAlien) ? ((WeakAlien) alien).attack() : ((StrongAlien) alien).attack();
                        playerShip.takeDamage(damage);
                        System.out.println("Your ship took " + damage + " damage! HP left: " + playerShip.getHp());
                    } else {
                        System.out.println("Alien defeated!");
                    }
                } else {
                    //Fleeing costs fuel
                    System.out.println("You fled and lost 5 fuel.");
                    playerShip.useFuel(5);
                }
            } else {
                System.out.println("No aliens. Safe to mine resources.");
            }
// Title: Java Conditions and If Statements
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_conditions.asp

            //Collect resources based on planet type
            if (currentPlanet instanceof RockyPlanet) {
                playerShip.addResource(((RockyPlanet) currentPlanet).getResource());
            } else if (currentPlanet instanceof GasPlanet) {
                playerShip.addResource(((GasPlanet) currentPlanet).getResource());
            }
// Title: Java Conditions and If Statements
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_conditions.asp

            currentPlanet.visit();
            playerShip.useFuel(10);

            if (playerShip.getHp() <= 0) {
                System.out.println("\nYour ship has been destroyed! Game Over.");
                break;
            }
            if (playerShip.getFuel() <= 0) {
                System.out.println("\nYou ran out of fuel! Game Over.");
                break;
            }
        }
// Title: Java Conditions and If Statements
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_conditions.asp

        // Print final game report
        GameReport report = new GameReport(playerShip);
        report.printReport();
        System.out.println("=== Thanks for playing Space Mining Adventure! ===");
    }
}
