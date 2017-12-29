public class Jellybean extends Sweet {
    private double inflexibility;
    public Jellybean(String name, double weight, float cost, double inflexibility) {
        super(name, weight, cost);
        setInflexibility(inflexibility);
    }

    public void setInflexibility(double inflexibility) {
        this.inflexibility = inflexibility;
    }

    public double getInflexibility() {
        return inflexibility;
    }

    public String toString() {
        return "name: " + getName() + ", weight: " + getWeight() + ", cost: " +getCost()+ ", inflexibility: " + getInflexibility();
    }
}