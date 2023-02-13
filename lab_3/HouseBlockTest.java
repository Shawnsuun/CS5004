/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The HouseBlockTest class of the lab3
 ******/

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * HouseBlockTest is a test class for testing the functionality of the houseBlock class.
 * The class tests the creation of houseBlock and tests the breakBlock method.
 */
public class HouseBlockTest {
    private Resource woodResource;
    private Resource stoneResource;
    private Block houseBlock;

    /**
     * The setUp method initializes the required resources and the houseBlock before each test is run.
     */
    @Before
    public void setUp() {
        woodResource = new Resource(Const.woodUnitWeight, ResourceType.WOOD);
        stoneResource = new Resource(Const.stoneUnitWeight, ResourceType.STONE);
        houseBlock = new houseBlock(woodResource, stoneResource);
    }

    /**
     * Test to check if the houseBlock object is created successfully.
     */
    @Test
    public void houseBlockTest1() {
        assertNotNull(houseBlock);
    }

    /**
     * Test to check if an exception is thrown when the resources are insufficient.
     */
    @Test
    public void houseBlockTest2() {
        woodResource = new Resource(Const.woodUnitWeight - 1, ResourceType.WOOD);
        try {
            houseBlock = new houseBlock(woodResource, stoneResource);
        } catch (IllegalArgumentException e) {
            assertEquals("Insufficient resource", e.getMessage());
        }
    }

    /**
     * Test to check if the breakBlock method returns the expected resource after breaking the block.
     */
    @Test
    public void BreakBlockTest() {
        Resource brokenBlock = houseBlock.breakBlock();
        assertNotNull(brokenBlock);
        assertEquals(Const.stoneBlockNeeded, brokenBlock.getAmount(), 0.001);
        assertEquals(ResourceType.STONE, brokenBlock.getType());
    }
}
