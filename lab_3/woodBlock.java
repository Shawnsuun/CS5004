public class woodBlock extends Block {

    public woodBlock() {
        super(ResourceType.WOOD, Const.woodUnitWeight);
    }

    public woodBlock(ResourceType t, double w) {
        super(t, w);
    }

    private Resource breakBlock() {
        return new Resource(0.5 * Const.woodUnitWeight, ResourceType.WOOD);
    }
}
