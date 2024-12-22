package hometasks.lesson7.services;

import hometasks.lesson7.domain.Order;

public interface DeliveryOrderService {

    default void delivery(Order order) {
        System.out.println("All orders will be getting in delivery window");
    }
}
