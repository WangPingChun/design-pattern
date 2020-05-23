package com.net4w.strategy.duck;

/**
 * @author WangPingChun
 */
public abstract class Duck {
    public void quack() {
        System.out.println("鸭子嘎嘎叫~~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~~");
    }

    public void fly() {
        System.out.println("鸭子会飞~~~");
    }

    /**
     * 显示鸭子信息.
     */
    public abstract void display();
}
