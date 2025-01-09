package hometasks.lesson10.services;

import hometasks.lesson10.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductMethods {

    public Product findByName (List<Product> list, String name) {
        for (Product product : list) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> findByCost (List<Product> list, int cost) {
        List<Product> result = new ArrayList<>();
        for (Product product : list) {
            if (product.getCost() >= cost) {
                result.add(product);
            }
        }
        return result;
    }

    public int getCountOfAllProducts (List<Product> list) {
        int count = 0;
        for (Product product : list) {
            count = product.getCount() + count;
        }
        return count;
    }

    public List<Product> getListOfProducts (List<Product> list) {
        return list;
    }

    public List<Product> makeReverseList (List<Product> list) {
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            result.add(list.get(j));
        }
        return result;
    }
}
