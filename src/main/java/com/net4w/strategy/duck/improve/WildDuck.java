package com.net4w.strategy.duck.improve;

/**
 * @author WangPingChun
 */
public class WildDuck extends Duck {
    public WildDuck() {
        super(new GoodFlyBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是一只野鸭");
    }
}
