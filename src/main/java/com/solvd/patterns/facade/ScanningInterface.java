package com.solvd.patterns.facade;

public class ScanningInterface {

    private final Scanner scanner;
    private final ScanSystem scanSystem;
    private final User user;

    public ScanningInterface(Scanner scanner, ScanSystem scanSystem, User user){
        this.scanner = scanner;
        this.scanSystem = scanSystem;
        this.user = user;
    }

    public void makeScanning(){
        user.pressToScan();
        scanner.scan();
        scanSystem.verifyPrint();
    }
}
