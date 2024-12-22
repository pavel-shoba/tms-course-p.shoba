package hometasks.lesson7.services.impl;

import hometasks.lesson7.domain.Order;
import hometasks.lesson7.services.CookOrderService;

public class CookOrderServiceImpl implements CookOrderService {

    public void cook(Order order) {
        System.out.println("The order with " + order.getFood() + " is cooking");
    }
}
