package hometasks.lesson7.domain;

public class Order {

    private int number;
    private boolean isUserAdress;
    private String adress;
    private String food;

    public Order(int number, boolean isUserAdress, String adress, String food) {
        this.number = number;
        this.isUserAdress = isUserAdress;
        this.adress = adress;
        this.food = food;
    }

    public int getNumber() {
        return number;
    }

    public boolean getIsUserAdress() {
        return isUserAdress;
    }

    public String getAdress(){
        return adress;
    }

    public String getFood() {
        return food;
    }
}
