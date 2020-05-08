package com.net4w.factory.factorymethod.pizzastore.order;

import com.net4w.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.net4w.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.net4w.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author WangPingChun
 */
public class BJOrderPizza extends OrderPizza {
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
