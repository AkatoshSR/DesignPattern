package com.sqx.store;


import com.sqx.Factory.NYPizzaIngredientFactory;
import com.sqx.Factory.PizzaIngredientFactory;
import com.sqx.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if ("cheese".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NYStyleCheesePizza");
        }else if("veggie".equals(type)){
            pizza = new veggiePizza(ingredientFactory);
            pizza.setName("NYStyleVeggiePizza");
        }else if("clam".equals(type)){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NYStyleClamPizza");
        }else if("pepperoni".equals(type)){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("BYStylePepperoniPizza");
        }

        return pizza;
    }
}
