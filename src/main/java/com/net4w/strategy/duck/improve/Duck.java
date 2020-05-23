package com.net4w.strategy.duck.improve;

import lombok.RequiredArgsConstructor;

/**
 * @author WangPingChun
 */
@RequiredArgsConstructor
public abstract class Duck {
    private final FlyBehavior flyBehavior;

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~~");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    /**
     * 显示鸭子信息.
     */
    public abstract void display();
}
