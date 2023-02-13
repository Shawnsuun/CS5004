/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The HouseFactoryTest class of the lab3
 ******/

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * HouseFactoryTest is a JUnit test class tests the functionality of the HouseFactory class.
 * It tests the takeResource method and the produce method.
 */

public class HouseFactoryTest {

    /**
     * Test case to validate the handling of a null resource
     */
    @Test
    public void takeResourceNullTest() {
        HouseFactory houseFactory = new HouseFactory();
        try {
            houseFactory.takeResource(null);
        } catch (IllegalArgumentException e) {
            assertEquals("object is null", e.getMessage());
        }
    }

    /**
     * Test case to validate the handling of a stone block resource
     */
    @Test
    public void takeResourceStoneBlockTest() {
        HouseFactory houseFactory = new HouseFactory();
        Block stoneBlock = new stoneBlock(ResourceType.STONE, Const.stoneUnitWeight);
        houseFactory.takeResource(stoneBlock);
        assertEquals(1, houseFactory.stoneBlockInventory);
    }

    /**
     * Test case to validate the handling of a wood block resource
     */
    @Test
    public void takeResourceWoodBlockTest() {
        HouseFactory houseFactory = new HouseFactory();
        Block woodBlock = new woodBlock(ResourceType.WOOD, Const.woodUnitWeight);
        houseFactory.takeResource(woodBlock);
        assertEquals(1, houseFactory.woodBlockInventory);
    }

    /**
     * Test case to validate the production of a house block when there are enough resources
     */
    @Test
    public void produceTest1() {
        HouseFactory houseFactory = new HouseFactory();
        Block stoneBlock = new stoneBlock(ResourceType.STONE, Const.stoneUnitWeight);
        Block woodBlock = new woodBlock(ResourceType.WOOD, Const.woodUnitWeight);
        for (int i = 0; i < Const.stoneBlockNeeded; i++) {
            houseFactory.takeResource(stoneBlock);
        }
        for (int i = 0; i < Const.woodBlockNeeded; i++) {
            houseFactory.takeResource(woodBlock);
        }
        Block houseBlock = houseFactory.produce();
        assertNotNull(houseBlock);
    }

    /**
     * Test case to validate that a house block is not produced when there are not enough resources
     */
    @Test
    public void produceTest2() {
        HouseFactory houseFactory = new HouseFactory();
        Block stoneBlock = new stoneBlock(ResourceType.STONE, Const.stoneUnitWeight);
        for (int i = 0; i < Const.stoneBlockNeeded - 1; i++) {
            houseFactory.takeResource(stoneBlock);
        }
        Block houseBlock = houseFactory.produce();
        assertNull(houseBlock);
    }
}

