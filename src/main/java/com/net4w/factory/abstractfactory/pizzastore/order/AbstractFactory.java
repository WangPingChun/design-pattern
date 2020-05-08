package com.net4w.factory.abstractfactory.pizzastore.order;

import com.net4w.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽象层.
 *
 * @author WangPingChun
 */
public interface AbstractFactory {
    Pizza createPizza(String orderType);
}
