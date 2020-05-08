package com.net4w.factory.abstractfactory.pizzastore.order;

import com.net4w.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.net4w.factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import com.net4w.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author WangPingChun
 */
public class BJFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
