package com.solvd.patterns.strategy;

public class Subscription implements UsagePeriod{

    @Override
    public void doFunctions() {
        System.out.println("You are allowed to do the full range of basic tasks");
    }
}
