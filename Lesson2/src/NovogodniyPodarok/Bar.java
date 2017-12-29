public class Bar extends Sweet{
    private boolean nuts;
    public Bar(String name, double weight, float cost, boolean nuts) {
        super(name, weight, cost);
        setNuts(nuts);
    }

    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }

    public boolean isNuts() {
        return nuts;
    }

    public String toString() {
        return "name: " + getName() + ", weight: " + getWeight() + ", cost: " +getCost()+ ", has nuts: " + isNuts();
    }
}