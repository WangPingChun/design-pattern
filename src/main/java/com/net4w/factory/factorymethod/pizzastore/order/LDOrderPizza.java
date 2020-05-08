package com.net4w.factory.factorymethod.pizzastore.order;

import com.net4w.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.net4w.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.net4w.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author WangPingChun
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
