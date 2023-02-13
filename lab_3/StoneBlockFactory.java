/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The StoneBlockFactory class of the lab3
 ******/

/**
 *  A stone block factory needs to have a resource bin
 *  to store resources and implement the factory interface.
 */
public class StoneBlockFactory implements Factory {
    private Resource stoneBin;

    /**
     * Constructor takes no arguments to create a StoneBlockFactory
     */
    public StoneBlockFactory() {
        this.stoneBin = new Resource(0, ResourceType.STONE);
    }

    /**
     * This method takes a resource object stores it in the inventory
     * @param resource The resource object to be stored
     */
    @Override
    public void takeResource(Object resource) {
        try {
            if (resource == null) {
                throw new IllegalArgumentException("object is null");
            }
            //throw an exception if we send it something that isn’t a resource
            if (!(resource instanceof Resource)) {
                throw new IllegalArgumentException("object is not a valid resource");
            }
            //throw an exception if the resource isn’t the appropriate type
            if (((Resource) resource).getType() != ResourceType.STONE) {
                throw new IllegalArgumentException("Stone factory need to take stone resource");
            }

            this.stoneBin.addAmount(((Resource)resource).getAmount());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

    /**
     * This method is used to produce a block using the resources of inventory
     * @return The produced block
     */
    @Override
    public Block produce() {
        if (this.stoneBin.getAmount() >= Const.stoneBlockNeeded) {
            this.stoneBin.subtractAmount(Const.stoneBlockNeeded);
            return new stoneBlock();
        }
        return null;
    }

    /**
     * This override method displays the inventory of factory.
     */
    @Override
    public void displayInventory() {
        System.out.println((this.stoneBin.getAmount()));
    }
}
