public class houseBlock extends Block {
    int woodBlocks;
    int stoneBlocks;

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

    @Override
    public Resource breakBlock() {
        return new Resource(Const.stoneBlockNeeded, ResourceType.STONE);
    }
}

