package com.solvd.patterns.factory;

public class Main {

    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        System.out.println("Bus trip\n");
        transportFactory.goOnTrip(TransportType.BUS);
        System.out.println("Car trip\n");
        transportFactory.goOnTrip(TransportType.CAR);
        System.out.println("Taxi trip\n");
        transportFactory.goOnTrip(TransportType.TAXI);
        System.out.println("Subway trip\n");
        transportFactory.goOnTrip(TransportType.SUBWAY);
    }
}
