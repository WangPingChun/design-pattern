package com.net4w.strategy.duck;

/**
 * @author WangPingChun
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔");
    }
}
