package hometasks.lesson7;
import hometasks.lesson7.domain.Order;
import hometasks.lesson7.services.OrderHandler;
import hometasks.lesson7.services.impl.*;

public class MainApp {

    public static void main(String[] args) {

        Order order = new Order(1, false, "Minsk, Gikalo str. 7-54", "pizza");

        OrderHandler orderHandler = new OrderHandlerImpl(
                new PhoneGetOrderServiceImpl(),
                new OrderDataServiceImpl(),
                new CookOrderServiceImpl(),
                new HomeDeliveryOrderServiceImpl() {
        });

        orderHandler.recieve(order);


    }
}
