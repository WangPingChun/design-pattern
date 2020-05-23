package com.net4w.strategy.duck.improve;

/**
 * @author WangPingChun
 */
public class PekingDuck extends Duck {
    public PekingDuck() {
        super(new NoFlyBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }
}
