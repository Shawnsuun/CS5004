/******
 Name: Xiaowen Sun
 Assignment: Lab_3
 Date: 2023-02-13
 Notes: The Resource class of the lab3
 ******/

/**
 The Resource Class represents the materials for making blocks
 */
public class Resource {
    private double weight;
    private ResourceType type;

    /**
     * Constructor takes two resources as inputs and creates a house block
     * @param w weight of resource
     * @param t resource type
     */
    public Resource(double w, ResourceType t) {
        this.weight = w;
        this.type = t;
    }

    /**
     * a method to add to an amount of an existing resource of the same type
     * @param added a double of weight to be added
     */
    public void addAmount(double added) {
        this.weight += added;
    }

    /**
     * a method to subtract to an amount of an existing resource of the same type
     * @param subtracted a double of weight to be subtracted
     */
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

    /**
     * Gets the type of the Resource.
     * @return the ResourceType of the Resource
     */
    public ResourceType getType() {
        return this.type;
    }

    /**
     * Gets the amount of the Resource.
     * @return a double of the weight of the Resource
     */
    public double getAmount() {
        return this.weight;
    }
}
