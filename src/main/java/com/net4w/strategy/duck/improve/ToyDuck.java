package com.net4w.strategy.duck.improve;

/**
 * @author WangPingChun
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        super(new BadFlyBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }

}
