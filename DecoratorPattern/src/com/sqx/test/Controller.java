package com.sqx.test;

import com.sqx.Component.Beverage;
import com.sqx.ConcreteComponent.DarkRoast;
import com.sqx.ConcreteComponent.Decaf;
import com.sqx.CondimentDecorator.Milk;
import com.sqx.CondimentDecorator.Mocha;
import com.sqx.CondimentDecorator.Soy;
import com.sqx.CondimentDecorator.Whip;

public class Controller {
    public static void main(String[] args) {

        // DarkRoast + Milk + Mocha + Mocha
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);

        // Decaf + Mocha + Soy + Whip
        Beverage beverage2 = new Decaf();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);


        System.out.println("========================================================");
        System.out.println("DarkRoast + Milk + Mocha + Mocha：");
        System.out.println(beverage1.getDescription() + "：" + beverage1.cost());
        System.out.println("========================================================");
        System.out.println("Decaf + Mocha + Soy + Whip：");
        System.out.println(beverage2.getDescription() + "：" + beverage2.cost());
        System.out.println("========================================================");

    }
}
