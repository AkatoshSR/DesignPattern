package com.sqx.CondimentDecorator;

import com.sqx.Component.Beverage;
import com.sqx.Utils.StringManager;

public class Mocha extends CondimentDecorator{

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + StringManager.Mocha;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5;
    }
}
