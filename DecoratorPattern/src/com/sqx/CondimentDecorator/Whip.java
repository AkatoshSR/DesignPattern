package com.sqx.CondimentDecorator;

import com.sqx.Component.Beverage;
import com.sqx.Utils.StringManager;

public class Whip extends CondimentDecorator{

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + StringManager.Whip;
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.5;
    }
}
