package com.solvd.patterns.factory;

public class Subway implements Transport {

    @Override
    public void startTrip() {
        System.out.println("Enter the subway \nBuy a subway token \nChoose a direction \nEnter the train");
        System.out.println();
    }

    @Override
    public void continueTrip() {
        System.out.println("Change the subway line if necessary");
        System.out.println();
    }

    @Override
    public void endTrip() {
        System.out.println("Choose the exit direction \nGo out of the subway");
        System.out.println();
    }
}
