package com.solvd.patterns.facade;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        Scanner scanner = new Scanner();
        ScanSystem scanSystem = new ScanSystem();

        ScanningInterface scanningInterface = new ScanningInterface(scanner,scanSystem,user);
        scanningInterface.makeScanning();
    }
}
