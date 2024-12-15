package hometasks.lesson6;

public class Product {

    private String name;
    private int cost;
    private boolean isAvailbale;
    private Type state;

    public Product(String name, int cost, Type state, boolean isAvailbale) {
        this.name = name;
        this.cost = cost;
        this.state = state;
        this.isAvailbale = isAvailbale;
    }

    public String getName(){
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Type getState() {
        return state;
    }

    public boolean getIsAvailable() {
        return isAvailbale;
    }
}
