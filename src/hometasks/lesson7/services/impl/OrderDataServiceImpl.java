package hometasks.lesson7.services.impl;

import hometasks.lesson7.domain.Order;
import hometasks.lesson7.services.OrderDataService;

public class OrderDataServiceImpl implements OrderDataService {

    public void save(Order order) {
        System.out.println("Save order " + order.getNumber() + " to database");
    }
}
