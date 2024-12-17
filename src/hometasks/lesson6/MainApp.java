package hometasks.lesson6;

public class MainApp {

    public static void main(String[] args) {

        Product [] products = {
                new Product("iPhone16", 1000, Type.MOBILE, true),
                new Product("Xiaomi", 300, Type.MOBILE, false),
                new Product("LG", 500, Type.TV, true),
                new Product("Samsung", 700, Type.TV, false),
                new Product("JBL", 100, Type.AUDIO, true),
                new Product("Sony", 200, Type.AUDIO,false)
        };

//Here first task

        ProductReport productReport = new ProductReport();
        int sum = productReport.getCostAllProductsByType(products, Type.MOBILE);
        System.out.println("Cost all products by type is: " + sum);

        int count = productReport.getCountOfProductsByType(products, Type.TV);
        System.out.println("Count of all products by type is: " + count);

//Here second task

        StaticFunctions.printString("Hello, I hope it's working!", 5);

    }
}
