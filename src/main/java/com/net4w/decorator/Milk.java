package com.net4w.decorator;

/**
 * @author WangPingChun
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDescription("Milk");
        setPrice(2D);
    }
}
