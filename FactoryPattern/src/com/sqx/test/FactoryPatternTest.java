package com.sqx.test;

import com.sqx.pizza.ChicagoStyleCheesePizza;
import com.sqx.pizza.Pizza;
import com.sqx.pizzaStore.ChicagoPizzaStore;
import com.sqx.pizzaStore.NYPizzaStore;
import com.sqx.pizzaStore.PizzaStore;

public class FactoryPatternTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());

    }
}
