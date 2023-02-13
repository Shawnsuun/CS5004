/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The recycleSite class of the lab3
 ******/

/**
 * The recycleSite class represents a recycling site where blocks of different types can be recycled.
 * The class contains two member variables woodBin and stoneBin of type Resource.
 * The class provides a recycle method to recycle blocks of different types.
 */
public class recycleSite {
    /**
     * A Resource object to store recycled wood blocks.
     */
    Resource woodBin;
    /**
     * A Resource object to store recycled stone blocks.
     */
    Resource stoneBin;

    /**
     * Constructs a new RecycleSite object.
     */
    public recycleSite() {
        this.woodBin = new Resource(0.0, ResourceType.WOOD);
        this.stoneBin = new Resource(0.0, ResourceType.STONE);
    }

    /**
     * Recycles the specified block.
     * @param block The block to be recycled.
     */
    public void recycle(Object block) {
        try {
            if (block == null) {
                throw new IllegalArgumentException("object is null");
            }
            //throw an exception if we send it something that isn’t a resource
            if (!(block instanceof Block)) {
                throw new IllegalArgumentException("object is not a valid block");
            }
            switch (((Block)block).getType()) {
                case WOOD:
                    this.woodBin.addAmount(((woodBlock) block).breakBlock().getAmount());
                    break;
                case STONE:
                    this.stoneBin.addAmount(((stoneBlock) block).breakBlock().getAmount());
                    break;
                case HOUSE:
                    this.stoneBin.addAmount(((houseBlock) block).breakBlock().getAmount());
                    break;
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }
}
