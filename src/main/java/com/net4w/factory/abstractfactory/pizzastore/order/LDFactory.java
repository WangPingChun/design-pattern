package com.net4w.factory.abstractfactory.pizzastore.order;

import com.net4w.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.net4w.factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import com.net4w.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author WangPingChun
 */
public class LDFactory implements AbstractFactory {
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
