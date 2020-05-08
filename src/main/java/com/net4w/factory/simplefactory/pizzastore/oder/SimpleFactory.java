package com.net4w.factory.simplefactory.pizzastore.oder;

import com.net4w.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.net4w.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.net4w.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.net4w.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * 简单工厂模式.
 * <p>
 * 简单工厂模式也叫静态工厂模式
 *
 * @author WangPingChun
 */
public class SimpleFactory {
    /**
     * 根据 type 返回对应的 Pizza 对象
     *
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        // 订购披萨类型
        if (type.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        } else if (type.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("pepper");
        }

        return pizza;
    }

    public static Pizza createPizza2(String type) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        // 订购披萨类型
        if (type.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        } else if (type.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("pepper");
        }

        return pizza;
    }
}
