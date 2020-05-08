package com.net4w.factory.abstractfactory.pizzastore.order;

import com.net4w.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WangPingChun
 */
public class OrderPizza {
    protected AbstractFactory factory;

    public OrderPizza(AbstractFactory factory) {
        setAbstractFactory(factory);
    }

    private void setAbstractFactory(AbstractFactory abstractFactory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = abstractFactory;
        do {
            orderType = getType();
            // factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                // 订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }


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
