package com.solvd.patterns.decorator;

public class WaffleMakerImpl implements WaffleMaker {

    @Override
    public void putDough() {
        System.out.println("Prepare the dough and pour it");
    }

    @Override
    public void bakeWaffle() {
        System.out.println("Your waffles are baked");
    }
}
