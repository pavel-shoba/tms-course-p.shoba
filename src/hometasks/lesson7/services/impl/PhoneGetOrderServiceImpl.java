package hometasks.lesson7.services.impl;

import hometasks.lesson7.domain.Order;
import hometasks.lesson7.services.GetOrderService;

public class PhoneGetOrderServiceImpl implements GetOrderService {

    public void apply(Order order) {
        System.out.println("Order number " + order.getNumber() + " was got by phone");
    }
}
