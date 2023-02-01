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

    public void substractAmount(double substracted) {
        this.weight -= substracted;
    }
}
