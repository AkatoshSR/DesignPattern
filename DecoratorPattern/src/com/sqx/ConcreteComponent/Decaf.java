package com.sqx.ConcreteComponent;

import com.sqx.Component.Beverage;
import com.sqx.Utils.StringManager;

public class Decaf extends Beverage {

    public Decaf() {
        super();
        description = StringManager.Decaf;
    }

    @Override
    public double cost() {
        return 40;
    }
}
