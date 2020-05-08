package com.net4w.factory.factorymethod.pizzastore.pizza;

/**
 * @author WangPingChun
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨准备原材料");
    }
}
