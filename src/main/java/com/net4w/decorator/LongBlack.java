package com.net4w.decorator;

/**
 * @author WangPingChun
 */
public class LongBlack extends Coffee {
    public LongBlack() {
        setDescription("LongBlack");
        setPrice(5.0D);
    }

    @Override
    public Double cost() {
        return this.getPrice();
    }
}
