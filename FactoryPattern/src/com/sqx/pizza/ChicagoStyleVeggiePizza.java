package com.sqx.pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        setName("Chicago Style Deep Dish Veggie Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");

        addToppings("Shredded Mozzarella Veggie");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }


}
