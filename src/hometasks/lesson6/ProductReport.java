package hometasks.lesson6;

public class ProductReport {

    public int getCostAllProductsByType (Product[] products, Type state) {
        int sum = 0;
        for (Product product : products) {
            if(product.getState() == state) {
                sum += product.getCost();
            }
        }
        return sum;
    }

    public int getCountOfProductsByType (Product[] products, Type state) {
        int count = 0;
        for (Product product : products) {
            if(product.getState() == state && product.getIsAvailable() == true) {
                count += 1;
            }
        }
        return count;
    }
}
