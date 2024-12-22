package hometasks.lesson7.services.impl;

import hometasks.lesson7.domain.Order;
import hometasks.lesson7.services.DeliveryOrderService;

public class HomeDeliveryOrderServiceImpl implements DeliveryOrderService {

    public void delivery(Order order) {
        if(order.getIsUserAdress()==true) {
                System.out.println("The order will be delivery to client on adress " + order.getAdress());
        } else {
            System.out.println("Another way for delivery, call the client, please");
        }
    }
}
