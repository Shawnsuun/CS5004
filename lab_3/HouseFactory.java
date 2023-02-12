public class HouseFactory implements Factory {
    int stoneBlockInventory;
    int woodBlockInventory;

    public HouseFactory() {
        stoneBlockInventory = 0;
        woodBlockInventory = 0;
    }

    @Override
    public void takeResource(Object block) {
        try {
            if (block == null) {
                throw new IllegalArgumentException("object is null");
            }
            //throw an exception if we send it something that isn’t a resource
            if (!(block instanceof Block)) {
                throw new IllegalArgumentException("object is not a valid block");
            }
            //throw an exception if the resource isn’t the appropriate type
            if (!(((Block) block).getType() == ResourceType.WOOD ||
                ((Block) block).getType() == ResourceType.STONE)) {
                throw new IllegalArgumentException("House factory need to take wood or stone resource");
            }

            switch (((Block) block).getType()) {
                case WOOD:
                    this.woodBlockInventory ++;
                case STONE:
                    this.stoneBlockInventory ++;
                    break;
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public Block produce() {
        if (this.stoneBlockInventory >= Const.stoneBlockNeeded &&
            this.woodBlockInventory >= Const.woodBlockNeeded ) {
            this.stoneBlockInventory -= Const.stoneBlockNeeded;
            this.woodBlockInventory -= Const.woodBlockNeeded;
            return new houseBlock(new Resource(Const.woodUnitWeight * Const.woodBlockNeeded, ResourceType.WOOD),
                    new Resource(Const.stoneUnitWeight * Const.woodBlockNeeded, ResourceType.STONE));
        }
        return null;
    }

    @Override
    public void displayInventory() {
        System.out.println("stone blocks: " + (this.stoneBlockInventory));
        System.out.println("wood blocks: " + (this.woodBlockInventory));
    }
}
