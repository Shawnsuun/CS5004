public abstract class Block {
    private ResourceType type;
    private double weight;


    public Block(ResourceType t, double w) {
        this.type = t;
        this.weight = w;
    }

    public Block(ResourceType type1, ResourceType type2) {
        this.type = ResourceType.HOUSE;
        this.weight = Const.woodUnitWeight * Const.woodBlockNeeded;
        this.weight += Const.stoneUnitWeight * Const.stoneBlockNeeded;
    }
}
