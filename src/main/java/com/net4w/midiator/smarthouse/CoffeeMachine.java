package com.net4w.midiator.smarthouse;

/**
 * @author WangPingChun
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        // 在创建Alarm同事对象时，将自己放入到ConcreteMediator对象集合中
        mediator.register(name, this);
    }

    public void startCoffee() {
        System.out.println("It's time to start coffee machine！");
    }

    public void finishCoffee() {
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }

    @Override
    public void sendMessage(int stateChange) {
        super.getMediator().getMessage(stateChange, super.name);
    }
}
