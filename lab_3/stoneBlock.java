public class stoneBlock extends Block {
    public stoneBlock() {
        super(ResourceType.STONE, Const.stoneUnitWeight);
    }

    public stoneBlock(ResourceType t, double w) {
        super(t, w);
    }

    private Resource breakBlock() {
        return new Resource(Const.stoneUnitWeight, ResourceType.STONE);
    }
}
