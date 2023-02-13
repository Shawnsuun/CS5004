/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The stoneBlock class of the lab3
 ******/

/**
 The stoneBlock Class is a subclass of Block, it represents the block made of wood resource
 */
public class stoneBlock extends Block {
    /**
     * Constructs a stone block with no given resource type and weight
     * ResourceType is STONE in default
     */
    public stoneBlock() {
        super(ResourceType.STONE, Const.stoneUnitWeight);
    }

    /**
     * Constructs a stone block with a given resource type and weight.
     *
     * @param t the type of resource the block represents
     * @param w the weight of the block
     */
    public stoneBlock(ResourceType t, double w) {
        super(t, w);
    }

    /**
     * Overridden method from the Block class that returns the Resource produced
     * @return broken block produced Resource
     */
    @Override
    public Resource breakBlock() {
        return new Resource(Const.stoneUnitWeight, ResourceType.STONE);
    }
}
