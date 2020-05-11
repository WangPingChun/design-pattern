package com.net4w.decorator;

/**
 * @author WangPingChun
 */
public class ShortBlack extends Coffee {
    public ShortBlack() {
        setDescription("ShortBlack");
        setPrice(4.0D);
    }

    @Override
    public Double cost() {
        return this.getPrice();
    }
}
