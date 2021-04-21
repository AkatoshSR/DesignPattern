package com.sqx.pizzaStore;

import com.sqx.pizza.NYStyleCheesePizza;
import com.sqx.pizza.NYStyleClamPizza;
import com.sqx.pizza.NYStyleVeggiePizza;
import com.sqx.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {

        if ("cheese".equals(type)){
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(type)){
            return new NYStyleVeggiePizza();
        } else if ("clam".equals(type)){
            return new NYStyleClamPizza();
        }else{
            return null;
        }
    }
}
