package com.solvd.patterns.strategy;

public class FreeTrial implements UsagePeriod{

    @Override
    public void doFunctions() {
        System.out.println("You are allowed to do very few tasks");
    }
}
