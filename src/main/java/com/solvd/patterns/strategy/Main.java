package com.solvd.patterns.strategy;

public class Main {

    public static void main(String[] args) {
        User user = new User("Leonid",69);
        user.doFunctions();
        System.out.println();

        user.setUsagePeriod(new Subscription());
        user.doFunctions();
        System.out.println();

        user.setUsagePeriod(new Professional());
        user.doFunctions();
    }
}
