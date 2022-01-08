package com.solvd.patterns.factory;

public class Taxi implements Transport{

    @Override
    public void startTrip() {
        System.out.println("Open the taxi app \nChoose a destination " +
                "\nChoose a payment method \nOrder a taxi \nWait for the car");
        System.out.println();
    }

    @Override
    public void continueTrip() {
        System.out.println("Enjoy the trip");
        System.out.println();
    }

    @Override
    public void endTrip() {
        System.out.println("Get out of the taxi \nRate the trip");
        System.out.println();
    }
}
