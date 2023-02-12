public class Resource {
    private double weight;
    private ResourceType type;

    public Resource(double w, ResourceType t) {
        this.weight = w;
        this.type = t;
    }

    public void addAmount(double added) {
        this.weight += added;
    }

    public void subtractAmount(double subtracted) {
        try {
            if (this.weight - subtracted < 0) {
                throw new ArithmeticException("Insufficient resource");
            }
            this.weight -= subtracted;
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
    }

    public ResourceType getType() {
        return this.type;
    }

    public double getAmount() {
        return this.weight;
    }
}
