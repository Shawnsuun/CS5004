public class WoodBlockFactory implements Factory {
    private Resource woodBin;

    public WoodBlockFactory() {
        this.woodBin = new Resource(0, ResourceType.WOOD);
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
            if (((Resource) resource).getType() != ResourceType.WOOD) {
                throw new IllegalArgumentException("Wood factory need to take wood resource");
            }

            this.woodBin.addAmount(((Resource)resource).getAmount());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public Block produce() {
        if (this.woodBin.getAmount() >= Const.woodBlockNeeded) {
            this.woodBin.subtractAmount(Const.woodBlockNeeded);
            return new woodBlock();
        }
        return null;
    }

    @Override
    public void displayInventory() {
        System.out.println((this.woodBin.getAmount()));
    }

}
