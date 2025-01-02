package hometasks.lesson10.services;

import hometasks.lesson10.domain.Product;

import java.util.List;

public class ProductMethods {

    public void findByName (List<Product> list, String name) {
        for (Product product : list) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println("Result of search by name: " +  product);
            }
        }
    }

    public void findByCost (List<Product> list, int cost) {
        System.out.println("Result of search by cost:");
        for (Product product : list) {
            if (product.getCost() >= cost) {
                System.out.println(product);
            }
        }
    }

    public void getCountOfAllProducts (List<Product> list) {
        int count = 0;
        for (Product product : list) {
            count = product.getCount() + count;
        } System.out.println("Count of all products is " + count);
    }

    public void getListOfProducts (List<Product> list) {
        System.out.println("List of all products:");
        for (int i = 0; i < list.size(); i++) {
            var product = list.get(i);
            System.out.println(product);
        }
    }

    public void makeReverseList (List<Product> list) {
        System.out.println("New one list is:");
        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}
