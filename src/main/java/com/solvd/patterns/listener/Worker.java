package com.solvd.patterns.listener;

public class Worker {

    private String name;
    private String specialization;

    public void receiveOrder(Order order){
        System.out.println(String.format("%s were ordered in quantity of %d",order.getProduct(),order.getQuantity()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
