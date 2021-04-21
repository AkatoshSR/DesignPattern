package com.sqx.pizza;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        setName("Chicago Style Deep Dish Clam Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");

        addToppings("Shredded Mozzarella Clam");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }


}
