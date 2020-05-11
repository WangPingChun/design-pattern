package com.net4w.decorator;

/**
 * @author WangPingChun
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDescription("Soy");
        setPrice(1.5D);
    }
}
