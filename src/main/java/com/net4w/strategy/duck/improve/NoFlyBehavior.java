package com.net4w.strategy.duck.improve;

/**
 * @author WangPingChun
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
