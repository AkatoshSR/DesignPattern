package com.sqx.Component;

public abstract class Beverage {

    protected String description;

    protected Beverage(){
        description = "unknown beverage";
    }

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
