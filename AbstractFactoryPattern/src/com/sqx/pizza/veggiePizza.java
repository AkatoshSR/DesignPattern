package com.sqx.pizza;

import com.sqx.Factory.PizzaIngredientFactory;

public class veggiePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public veggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setClams(ingredientFactory.createClams());
    }
}
