public class StoneBlockFactory implements Factory {
    private Resource stoneBin;

    public StoneBlockFactory() {
        this.stoneBin = new Resource(0, ResourceType.STONE);
    }

    @Override
    public void takeResource(Object resource) {
        try {
            if (resource == null) {
                throw new IllegalArgumentException("object is null");
            }
            //throw an exception if we send it something that isn’t a resource
            if (!(resource instanceof Resource)) {
                throw new IllegalArgumentException("object is not a valid resource");
            }
            //throw an exception if the resource isn’t the appropriate type
            if (((Resource) resource).getType() != ResourceType.STONE) {
                throw new IllegalArgumentException("Stone factory need to take stone resource");
            }

            this.stoneBin.addAmount(((Resource)resource).getAmount());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public Block produce() {
        if (this.stoneBin.getAmount() >= Const.stoneBlockNeeded) {
            this.stoneBin.subtractAmount(Const.stoneBlockNeeded);
            return new stoneBlock();
        }
        return null;
    }

    @Override
    public void displayInventory() {
        System.out.println((this.stoneBin.getAmount()));
    }
}
