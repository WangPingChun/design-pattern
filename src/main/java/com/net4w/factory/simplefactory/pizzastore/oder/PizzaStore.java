package com.net4w.factory.simplefactory.pizzastore.oder;

/**
 * 相当于一个客户端，发出订购
 *
 * @author WangPingChun
 */
public class PizzaStore {
    public static void main(String[] args) {
        final OrderPizza orderPizza = new OrderPizza();
        orderPizza.setSimpleFactory(new SimpleFactory());
    }
}
