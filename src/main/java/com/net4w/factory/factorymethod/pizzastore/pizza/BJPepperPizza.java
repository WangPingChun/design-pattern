package com.net4w.factory.factorymethod.pizzastore.pizza;

/**
 * @author WangPingChun
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨准备原材料");
    }
}
