package com.sqx.CondimentDecorator;

import com.sqx.Component.Beverage;
import com.sqx.Utils.StringManager;

public class Soy extends CondimentDecorator{

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + StringManager.Soy;
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }
}
