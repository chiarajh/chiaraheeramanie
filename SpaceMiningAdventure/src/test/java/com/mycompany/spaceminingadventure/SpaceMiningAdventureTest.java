/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.spaceminingadventure;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpaceMiningAdventureTest {

    @Test
    public void testCargoShipAddResource() {
        CargoShip ship = new CargoShip("TestMiner", 100, 50, 3);
        Resource iron = new Resource("Iron", 10);
        Resource hydrogen = new Resource("Hydrogen", 5);

        assertTrue(ship.addResource(iron));
        assertTrue(ship.addResource(hydrogen));

        Resource[] cargo = ship.getCargo();
        assertEquals("Iron", cargo[0].getName());
        assertEquals(10, cargo[0].getQuantity());
        assertEquals("Hydrogen", cargo[1].getName());
        assertEquals(5, cargo[1].getQuantity());
    }

    @Test
    public void testBattleShipAttack() {
        BattleShip battleShip = new BattleShip("Defender", 100, 50, 20);
        Alien alien = new Alien("Zorgon", 50);

        int damage = battleShip.attack(alien);
        assertEquals(20, damage);
        assertEquals(30, alien.getHp());
    }

    @Test
    public void testWeakAlienAttack() {
        WeakAlien alien = new WeakAlien("Martian", 20);
        int damage = alien.attack();
        assertEquals(5, damage);
    }

    @Test
    public void testStrongAlienAttack() {
        StrongAlien alien = new StrongAlien("Zorgon", 40);
        int damage = alien.attack();
        assertEquals(15, damage);
    }

    @Test
    public void testShipTakeDamageAndFuelUsage() {
        CargoShip ship = new CargoShip("StarMiner", 100, 50, 2);
        ship.takeDamage(30);
        ship.useFuel(20);

        assertEquals(70, ship.getHp());
        assertEquals(30, ship.getFuel());
    }

    @Test
    public void testPlanetVisit() {
        RockyPlanet planet = new RockyPlanet("Mars", new Resource("Iron", 10));
        assertFalse(planet.isVisited());

        planet.visit();
        assertTrue(planet.isVisited());
    }

    @Test
    public void testCargoShipCapacityLimit() {
        CargoShip ship = new CargoShip("Miner", 100, 50, 2);
        Resource r1 = new Resource("Iron", 10);
        Resource r2 = new Resource("Hydrogen", 5);
        Resource r3 = new Resource("Gold", 20);

        assertTrue(ship.addResource(r1));
        assertTrue(ship.addResource(r2));
        assertFalse(ship.addResource(r3)); // exceeds capacity
    }
}

