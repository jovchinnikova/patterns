package com.solvd.patterns.decorator;

public class Multibaker implements SandwichMaker,WaffleMaker {

    private final SandwichMaker sandwichMaker = new SandwichMakerImpl();
    private final WaffleMaker waffleMaker = new WaffleMakerImpl();

    @Override
    public void putSandwich() {
        sandwichMaker.putSandwich();
    }

    @Override
    public void bakeSandwich() {
        sandwichMaker.bakeSandwich();
        System.out.println("Your sandwich is ready! Bon appetit!");
    }

    @Override
    public void putDough() {
        waffleMaker.putDough();
    }

    @Override
    public void bakeWaffle() {
        waffleMaker.bakeWaffle();
        System.out.println("Add jam to your waffles. Bon appetit!");
    }
}
