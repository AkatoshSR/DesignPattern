package com.sqx.test;

import com.sqx.pizza.Pizza;
import com.sqx.store.NYPizzaStore;
import com.sqx.store.PizzaStore;

public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        // 创建工厂
        PizzaStore nyPizzaStore = new NYPizzaStore();


        Pizza pizza = nyPizzaStore.orderPizza("cheese");

        System.out.println(pizza.getName()+"准备好了");
    }
}
