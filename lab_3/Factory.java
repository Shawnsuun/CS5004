/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The Factory Interface of the lab3
 ******/

/**
 * The main interface for three factories in lab3.
 * Including takeResource, produce, and displayInventory
 */

public interface Factory {
    /**
     * This method takes a resource object stores it in the inventory
     * @param resource  The resource object to be stored
     */
    public void takeResource(Object resource);

    /**
     * This method is used to produce a block using the resources of inventory
     * @return The produced block
     */
    public Block produce();

    /**
     * This method displays the inventory of factory.
     */
    public void displayInventory();

}
