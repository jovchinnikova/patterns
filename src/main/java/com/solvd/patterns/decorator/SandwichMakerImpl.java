package com.solvd.patterns.decorator;

public class SandwichMakerImpl implements SandwichMaker {

    @Override
    public void putSandwich() {
        System.out.println("Put bread, cheese and ham");
    }

    @Override
    public void bakeSandwich() {
        System.out.println("Your sandwich is baked");
    }
}
