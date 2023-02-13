/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The woodBlock class of the lab3
 ******/

/**
 The woodBlock Class is a subclass of Block, it represents the block made of wood resource
 */
public class woodBlock extends Block {

    /**
     * Constructs a wood block with no given resource type and weight
     * ResourceType is WOOD in default
     */
    public woodBlock() {
        super(ResourceType.WOOD, Const.woodUnitWeight);
    }

    /**
     * Constructs a wood block with a given resource type and weight.
     *
     * @param t the type of resource the block represents
     * @param w the weight of the block
     */
    public woodBlock(ResourceType t, double w) {
        super(t, w);
    }

    /**
     * Overridden method from the Block class that returns the Resource produced
     * @return broken block produced Resource
     */
    @Override
    public Resource breakBlock() {
        return new Resource(0.5 * Const.woodUnitWeight, ResourceType.WOOD);
    }
}
