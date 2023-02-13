/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The WoodBlockFactory class of the lab3
 ******/

/**
 *  A  wood block factory needs to have a resource bin
 *  to store resources and implement the factory interface.
 */
public class WoodBlockFactory implements Factory {
    private Resource woodBin;

    /**
     * Constructor takes no arguments to create a WoodBlockFactory
     */
    public WoodBlockFactory() {
        this.woodBin = new Resource(0, ResourceType.WOOD);
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
            if (((Resource) resource).getType() != ResourceType.WOOD) {
                throw new IllegalArgumentException("Wood factory need to take wood resource");
            }

            this.woodBin.addAmount(((Resource)resource).getAmount());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

    /**
     * This method is used to produce a block using the resources of inventory
     * @return a produced block by the factory
     */
    @Override
    public Block produce() {
        if (this.woodBin.getAmount() >= Const.woodBlockNeeded) {
            this.woodBin.subtractAmount(Const.woodBlockNeeded);
            return new woodBlock();
        }
        return null;
    }

    /**
     * This override method displays the inventory of factory.
     */
    @Override
    public void displayInventory() {
        System.out.println((this.woodBin.getAmount()));
    }

}
