package com.sqx.pizza;

import com.sqx.material.*;

public abstract class Pizza {

    private String name;
    private Dough dough;
    private Sauce sauce;
    private Veggies veggies;
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("bake");
    }

    public void cut(){
        System.out.println("cut");
    }

    public void box(){
        System.out.println("box");
    }

    public String getName() {
        return name;
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Veggies getVeggies() {
        return veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public Clams getClams() {
        return clams;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setVeggies(Veggies veggies) {
        this.veggies = veggies;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + veggies +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
