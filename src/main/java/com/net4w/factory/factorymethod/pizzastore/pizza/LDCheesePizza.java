package com.net4w.factory.factorymethod.pizzastore.pizza;

/**
 * @author WangPingChun
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨准备原材料");
    }
}
