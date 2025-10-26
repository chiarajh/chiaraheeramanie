/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceminingadventure;

/**
 *
 * @author Chiara
 */
public class CargoShip extends SpaceShip {
    private int cargoCapacity;
    private Resource[] cargo;
    private int cargoIndex;

    public CargoShip(String name, int hp, int fuel, int cargoCapacity) {
        super(name, hp, fuel);
        this.cargoCapacity = cargoCapacity;
        this.cargo = new Resource[cargoCapacity];
        this.cargoIndex = 0;
    }
// Title: Java Constructors
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_constructors.asp
    public boolean addResource(Resource resource) {
        if (cargoIndex < cargoCapacity) {
            cargo[cargoIndex] = resource;
            cargoIndex++;
            return true;
        }
        return false;
// Title: Java Methods Return Values
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_methods_return.asp
    }
    public Resource[] getCargo() { return cargo; }
// Title: Java Encapsulation and Getters and Setters
// Author: W3Schools
// Date: 2025
// Version: 1
// Available: https://www.w3schools.com/java/java_encapsulation.asp

}


