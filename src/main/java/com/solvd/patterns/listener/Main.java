package com.solvd.patterns.listener;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        user1.setId(1);
        user1.setName("Irina");

        Worker worker1 = new Worker();
        worker1.setName("Maria");
        worker1.setSpecialization("operator");

        Worker worker2 = new Worker();
        worker2.setName("Roman");
        worker2.setSpecialization("deliveryman");

        Order order1 = new Order();
        order1.setProduct("apples");
        order1.setQuantity(200);
        order1.setPrice(2.80);
        order1.setUser(user1);

        OrderManager orderManager = new OrderManager(List.of(order1));
        orderManager.appointOrder(order1,worker1);
        orderManager.appointOrder(order1,worker2);
        orderManager.notifyWorkers(order1);
    }
}
