package com.solvd.patterns.strategy;

public class Professional implements UsagePeriod{

    @Override
    public void doFunctions() {
        System.out.println("You are allowed to use all the functionality and a wide range of tools for customization");
    }
}
