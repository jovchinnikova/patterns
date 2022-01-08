package com.solvd.patterns.decorator;

public class MultiBakerDecorator extends Multibaker implements GrillMaker {

    public void prepareSandwich(){
        super.putSandwich();
        super.bakeSandwich();
    }

    public void prepareWaffle(){
        super.putDough();
        super.bakeWaffle();
    }

    private void grillSausage(){
        System.out.println("Don't forget to turn over sausage");
    }

    @Override
    public void prepareSausage() {
        System.out.println("Put the sausage");
        grillSausage();
        System.out.println("Your sausage is grilled. Bon appetit!");
    }
}
