/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The houseBlock class of the lab3
 ******/

/**
 The houseBlock Class is a subclass of Block, it represents the house to be built
 */
public class houseBlock extends Block {
    /**
     * Constructor takes two resources as inputs and creates a house block
     * @param r1 wood resource
     * @param r2 stone resource
     * @throws IllegalArgumentException if the wrong resources or insufficient resources
     */
    public houseBlock(Resource r1, Resource r2) {
        super(r1, r2);
        try {
            if (r1.getType() != ResourceType.WOOD || r2.getType() == ResourceType.STONE) {
                throw new IllegalArgumentException("wrong resource input");
            }
            if (r1.getAmount() < Const.woodUnitWeight || r2.getAmount() < Const.stoneUnitWeight) {
                throw new IllegalArgumentException("Insufficient resource");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

    /**
     * Overridden method from the Block class that returns the Resource produced
     * @return broken block produced Resource
     */
    @Override
    public Resource breakBlock() {
        return new Resource(Const.stoneBlockNeeded, ResourceType.STONE);
    }
}

