package hometasks.lesson10.domain;

public class Product {

    private String name;
    private int cost;
    private int count;

    public Product(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + cost + ", quantity=" + count + "}";
    }
}
