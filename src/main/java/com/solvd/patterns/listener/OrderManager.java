package com.solvd.patterns.listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The order is processing by many workers, the workers should be notified that the order was made
 *
 * Example of usage: Email newsletters for users that have a subscription, email letters to the users
 * when some usage conditions change (for example, the end of free trial)
 */

public class OrderManager {

    private static final Map<Order, List<Worker>> orderMaking = new HashMap<>();

    public OrderManager(List<Order> orders){
        orders.stream()
                .forEach(order -> orderMaking.put(order,new ArrayList<>()));
    }

    public void appointOrder(Order order, Worker worker){
        List<Worker> workers = orderMaking.get(order);
        workers.add(worker);
    }

    public void notifyWorkers(Order order){
        List<Worker> workers = orderMaking.get(order);
        workers.stream()
                .forEach(worker -> worker.receiveOrder(order));
    }
}
