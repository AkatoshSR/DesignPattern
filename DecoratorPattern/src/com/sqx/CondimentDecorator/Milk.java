package com.sqx.CondimentDecorator;

import com.sqx.Component.Beverage;
import com.sqx.Utils.StringManager;

public class Milk extends CondimentDecorator{

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + StringManager.Milk;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
