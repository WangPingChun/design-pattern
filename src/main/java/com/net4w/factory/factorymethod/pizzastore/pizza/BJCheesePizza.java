package com.net4w.factory.factorymethod.pizzastore.pizza;

/**
 * @author WangPingChun
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨准备原材料");
    }
}
