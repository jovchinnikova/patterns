package com.solvd.patterns.factory;

public class Bus implements Transport{

    @Override
    public void startTrip() {
        System.out.println("Choose a bus according to your destination \nLook for your bus at the timetable " +
                "\nWait for the bus \nEnter the bus \nPay the trip");
        System.out.println();
    }

    @Override
    public void continueTrip() {
        System.out.println("Show your ticket to the controller if necessary");
        System.out.println();
    }

    @Override
    public void endTrip() {
        System.out.println("Get out of the bus");
        System.out.println();
    }
}
