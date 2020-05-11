package com.net4w.decorator;

/**
 * @author WangPingChun
 */
public class Espresso extends Coffee {
    public Espresso() {
        setDescription("Espresso");
        setPrice(6.0D);
    }

    @Override
    public Double cost() {
        return this.getPrice();
    }
}
