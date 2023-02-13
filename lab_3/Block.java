/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The Block class of the lab3
 ******/

/**
 * The Block class represents a block.
 * It has a ResourceType type and a double weight.
 *
 */

public abstract class Block {
    // Declare variables to store the resource type and weight of a block
    private ResourceType type;
    private double weight;

    /**
     * Constructs a wood or stone block with a given resource type and weight.
     * @param t the type of resource the block represents
     * @param w the weight of the block
     */
    public Block(ResourceType t, double w) {
        this.type = t;
        this.weight = w;
    }

    /**
     * Constructs a house block using two given resources.
     * @param resource1 the wood resource used to build the block
     * @param resource2 the stone resource used to build the block
     */
    public Block(Resource resource1, Resource resource2) {
        this.type = ResourceType.HOUSE;
        this.weight = Const.woodUnitWeight * Const.woodBlockNeeded;
        this.weight += Const.stoneUnitWeight * Const.stoneBlockNeeded;
    }

    /**
     * Gets the type of resource the block represents.
     * @return the type of resource the block represents
     */
    public ResourceType getType() {
        return this.type;
    }

    /**
     * Gets the weight of the block.
     * @return the weight of the block
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Breaks the block and returns the resource obtained.
     *
     * @return the resource obtained by breaking the block
     */
    abstract Resource breakBlock();

    /**
     * Returns a string representation of the block.
     *
     * @return a string representation of the block
     */
    @Override
    public String toString() {
        return "type=" + this.type + ", weight=" + this.weight;
    }
}
