package com.net4w.decorator;

/**
 * @author WangPingChun
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDescription("Chocolate");
        setPrice(3D);
    }
}
