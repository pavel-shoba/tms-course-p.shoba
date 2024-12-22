package hometasks.lesson7.services.impl;

import hometasks.lesson7.domain.Order;
import hometasks.lesson7.services.*;

public class OrderHandlerImpl implements OrderHandler {

    private GetOrderService getService;
    private OrderDataService dataService;
    private CookOrderService cookService;
    private DeliveryOrderService deliveryService;

    public OrderHandlerImpl(GetOrderService getService, OrderDataService dataService, CookOrderService cookService, DeliveryOrderService deliveryService) {
        this.getService = getService;
        this.dataService = dataService;
        this.cookService = cookService;
        this.deliveryService = deliveryService;
    }


    public void recieve(Order order) {
        getService.apply(order);
        dataService.save(order);
        cookService.cook(order);
        deliveryService.delivery();
    }
}
