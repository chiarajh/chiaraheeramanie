/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.dreambound;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import static org.junit.Assert.*;

public class DreamBoundTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Alice");
    }

    @Test
    public void testAddingItemsToInventory() {
        Inventory inventory = player.getInventory();
        inventory.addItem("Jungle Map");
        inventory.addItem("Candy Gem");

        // Use getters instead of accessing private fields directly
        assertEquals("Jungle Map", inventory.getItem(0));
        assertEquals("Candy Gem", inventory.getItem(1));
        assertEquals(2, inventory.getCount());
    }

    @Test
    public void testPlayerInitialization() {
        assertNotNull("Player should have an inventory", player.getInventory());
        assertEquals("Player's name should match constructor input", "Alice", player.getName());
    }

    @Test
    public void testDreamFactoryCreatesProperDreams() {
        DreamBound jungle = DreamFactory.createDream("Jungle", player);
        DreamBound scary = DreamFactory.createDream("Scary", player);
        DreamBound candy = DreamFactory.createDream("Candy", player);
        DreamBound sea = DreamFactory.createDream("Sea", player);

        assertTrue("Factory should create a JungleDream", jungle instanceof JungleDream);
        assertTrue("Factory should create a ScaryDream", scary instanceof ScaryDream);
        assertTrue("Factory should create a CandyDream", candy instanceof CandyDream);
        assertTrue("Factory should create a SeaDream", sea instanceof SeaDream);
    }

    @Test
    public void testJungleDreamChallenge() {
        JungleDream jungleDream = new JungleDream(player);
        String simulatedInput = "echo\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        assertTrue("JungleDream challenge should succeed", jungleDream.startChallenge());
    }

    @Test
    public void testScaryDreamChallenge() {
        ScaryDream scaryDream = new ScaryDream(player);
        String simulatedInput = "Rusty\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        assertTrue("ScaryDream challenge should succeed", scaryDream.startChallenge());
    }

    @Test
    public void testCandyDreamChallenge() {
        CandyDream candyDream = new CandyDream(player);
        String simulatedInput = "Gummy\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        assertTrue("CandyDream challenge should succeed", candyDream.startChallenge());
    }

    @Test
    public void testSeaDreamChallenge() {
        SeaDream seaDream = new SeaDream(player);
        String simulatedInput = "Conch\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        assertTrue("SeaDream challenge should succeed", seaDream.startChallenge());
        System.setIn(System.in);
    }

    @Test
    public void testSpawnRandomDream() {
        DreamBound randomDream = DreamServer.spawnRandomDream(player);
        assertNotNull("Spawned dream should not be null", randomDream);
        assertTrue(
                "Spawned dream should be one of the expected dream types",
                randomDream instanceof JungleDream
                || randomDream instanceof ScaryDream
                || randomDream instanceof CandyDream
                || randomDream instanceof SeaDream
        );
    }
}
