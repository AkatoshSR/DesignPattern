package com.sqx.pizza;

import java.util.ArrayList;

// 从一个抽象披萨类开始，所有的具体披萨都必须派生自这个类
public abstract class Pizza {
    private String name;   // 名称
    private String dough;  // 面团
    private String sauce;  //调味剂
    private ArrayList<String> toppings = new ArrayList<>(); // 一套配料

    public void prepare(){
        System.out.println("准备披萨：" + name);
        System.out.println("揉面团...");
        System.out.println("添加调味剂...");
        System.out.println("添加调味剂...");
        System.out.println("添加配料...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  "+toppings.get(i));
        }
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setDough(String dough) {
        this.dough = dough;
    }

    protected void setSauce(String sauce) {
        this.sauce = sauce;
    }

    protected void addToppings(String topping){
        toppings.add(topping);
    }



    public void bake(){
        System.out.println("Bake");
    }

    public void cut(){
        System.out.println("cut");
    }

    public void box(){
        System.out.println("box");
    }

    public String getName(){
        return name;
    }



}
