package com.sqx.ConcreteComponent;

import com.sqx.Component.Beverage;
import com.sqx.Utils.StringManager;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        super();
        description = StringManager.DarkRoast;
    }

    @Override
    public double cost() {
        return 20;
    }
}
