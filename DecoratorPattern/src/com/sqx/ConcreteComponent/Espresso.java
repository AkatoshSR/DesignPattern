package com.sqx.ConcreteComponent;

import com.sqx.Component.Beverage;
import com.sqx.Utils.StringManager;

public class Espresso extends Beverage {

    public Espresso() {
        super();
        description = StringManager.Espresso;
    }

    @Override
    public double cost() {
        return 30;
    }
}
