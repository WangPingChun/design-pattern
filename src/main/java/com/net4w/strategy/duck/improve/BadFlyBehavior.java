package com.net4w.strategy.duck.improve;

/**
 * @author WangPingChun
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔技术一般");
    }
}
