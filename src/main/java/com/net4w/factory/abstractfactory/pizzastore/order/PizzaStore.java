package com.net4w.factory.abstractfactory.pizzastore.order;

/**
 * @author WangPingChun
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
