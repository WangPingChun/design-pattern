package com.net4w.factory.simplefactory.pizzastore.pizza;

/**
 * @author WangPingChun
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
