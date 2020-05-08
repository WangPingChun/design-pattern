package com.net4w.factory.factorymethod.pizzastore.order;


import com.net4w.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WangPingChun
 */
public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        do {
            String orderType = getType();
            // 抽象方法，由工厂子类实现
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }


    /**
     * 定义一个抽象方法，让各个工厂子类自己实现
     *
     * @param orderType
     * @return
     */
    public abstract Pizza createPizza(String orderType);

    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("oder pizza type: ");
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
