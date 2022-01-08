package com.solvd.patterns.factory;

public class Car implements Transport{

    @Override
    public void startTrip() {
        System.out.println("Go to your car \nUnblock the car \nFasten your seat belt \nStart the car");
        System.out.println();
    }

    @Override
    public void continueTrip() {
        System.out.println("Drive anywhere you want \nDon't forget about traffic laws!");
        System.out.println();
    }

    @Override
    public void endTrip() {
        System.out.println("Find parking place \nStop the car \nUnfasten your seat belt \nLock the car");
        System.out.println();
    }
}
