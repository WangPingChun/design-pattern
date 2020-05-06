package com.net4w.factory.simplefactory.pizzastore.pizza;

/**
 * @author WangPingChun
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作胡椒披萨准备原材料");
    }
}
