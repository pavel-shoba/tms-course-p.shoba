package hometasks.lesson10;

import hometasks.lesson10.domain.Product;
import hometasks.lesson10.services.ProductMethods;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Product phone = new Product("iPhone", 1000, 10),
                watch = new Product("Xiaomi", 100, 50),
                monitor = new Product("Dell", 500, 30),
                tv = new Product("Samsung", 300, 20);

        List<Product> list = new ArrayList<>();
        list.add(phone);
        list.add(watch);
        list.add(monitor);
        list.add(tv);

        ProductMethods productMethods = new ProductMethods();

        //methods for product
        System.out.println("Result of search by name:");
        System.out.println(productMethods.findByName(list, "iPhone"));
        System.out.println("Result of search by cost:");
        System.out.println(productMethods.findByCost(list, 500));
        System.out.println("Count of all products is:");
        System.out.println(productMethods.getCountOfAllProducts(list));

        //add new one product in the middle of collection
        Product concole =  new Product("Xbox", 800, 15);
        int middleList = (Math.round(list.size() / 2));
        list.add(middleList, concole);

        //print size of list
        System.out.println("Size of collection is " + list.size());

        //check the last added product
        if(list.contains(concole)) {
            System.out.println(concole + " is in this collection");
        } else {
            System.out.println(concole + "is not here");
        }

        //print all list of product
        System.out.println("List of all products:");
        System.out.println(productMethods.getListOfProducts(list));

        //create new one list from original with reverse
        List<Product> newList = list.subList(0, list.size());
        System.out.println("New one list is:");
        System.out.println(productMethods.makeReverseList(newList));
    }
}
