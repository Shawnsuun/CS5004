/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The ResourceTest class of the lab3
 ******/

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the Resource class
 */
public class ResourceTest {
    private Resource resource;
    /**
     * Set up the resource object with an initial weight and type before each test
     */
    @Before
    public void setUp() {
        resource = new Resource(5, ResourceType.STONE);
    }

    /**
     * Test the addAmount method
     */
    @Test
    public void addAmountTest() {
        resource.addAmount(3);
        assertEquals(8, resource.getAmount(), 0.001);
    }

    /**
     * Test the subtractAmount method when the amount is sufficient
     */
    @Test
    public void subtractAmountTest() {
        resource.subtractAmount(3);
        assertEquals(2, resource.getAmount(), 0.001);
    }

    /**
     * Test the subtractAmount method when the amount is not sufficient
     */
    @Test
    public void subtractAmountNegativeTest() {
        try {
            resource.subtractAmount(10);
        } catch (ArithmeticException e) {
            assertEquals("Insufficient resource", e.getMessage());
        }
    }

    /**
     * Test the getType method
     */
    @Test
    public void getTypeTest() {
        assertEquals(ResourceType.STONE, resource.getType());
    }

    /**
     * Test the getAmount method
     */
    @Test
    public void getAmountTest() {
        assertEquals(5, resource.getAmount(), 0.001);
    }

}
