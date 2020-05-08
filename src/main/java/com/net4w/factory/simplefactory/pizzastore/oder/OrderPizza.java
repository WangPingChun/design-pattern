package com.net4w.factory.simplefactory.pizzastore.oder;

import com.net4w.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WangPingChun
 */
public class OrderPizza {
    // public OrderPizza() {
    //     Pizza pizza = null;
    //     // 订购披萨类型
    //     String orderType;
    //     do {
    //         orderType = getType();
    //         if (orderType.equals("greek")) {
    //             pizza = new GreekPizza();
    //             pizza.setName("greek");
    //         } else if (orderType.equals("cheese")) {
    //             pizza = new CheesePizza();
    //             pizza.setName("cheese");
    //         } else if (orderType.equals("pepper")) {
    //             pizza = new PepperPizza();
    //             pizza.setName("pepper");
    //         } else {
    //             break;
    //         }
    //         // 输出pizza制作过程
    //         pizza.prepare();
    //         pizza.bake();
    //         pizza.cut();
    //         pizza.box();
    //     } while (true);
    // }

    private SimpleFactory simpleFactory;
    private Pizza pizza = null;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        do {
            final String type = getType();
            pizza = simpleFactory.createPizza(type);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (pizza != null);
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
