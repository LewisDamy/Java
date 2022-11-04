package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creating an Order instance passing the args + the enum OrderStatus, and it's value
        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);
        System.out.println(order);
        // instantiating an OrderStatus object
        OrderStatus os1 = OrderStatus.DELIVERED;
        // instantiating an OrderStatus object as a string
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1 + " " + os2);
    }
    /*
        Categories of classes:
            - Views        (system screens)
            - Controllers  (the manager between the screen and the system)
            - Entities     (the object itself of the service)
            - Services     (some tertiary work required from entities)
            - Repositories (object responsible to access databases)
     */
}
