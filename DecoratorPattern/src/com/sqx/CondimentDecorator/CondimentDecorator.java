package com.sqx.CondimentDecorator;

import com.sqx.Component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

    @Override
    public abstract double cost();
}
