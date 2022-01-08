package com.solvd.patterns.factory;

public class TransportFactory {

    public void goOnTrip(TransportType transportType){
        Transport transport = null;

        switch (transportType){
            case BUS:
                transport = new Bus();
                break;
            case TAXI:
                transport = new Taxi();
                break;
            case CAR:
                transport = new Car();
                break;
            case SUBWAY:
                transport = new Subway();
                break;
            default:
                break;
        }

        transport.startTrip();
        transport.continueTrip();
        transport.endTrip();
    }
}
