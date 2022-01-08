package com.solvd.patterns.decorator;

public class Main {

    public static void main(String[] args) {
        MultiBakerDecorator multiBakerDecorator = new MultiBakerDecorator();
        multiBakerDecorator.prepareSandwich();
        System.out.println();
        multiBakerDecorator.prepareWaffle();
        System.out.println();
        multiBakerDecorator.prepareSausage();
    }
}
