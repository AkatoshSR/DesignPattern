package com.sqx.ConcreteComponent;

import com.sqx.Component.Beverage;
import com.sqx.Utils.StringManager;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        super();
        description = StringManager.HouseBlend;
    }

    @Override
    public double cost() {
        return 10;
    }
}
