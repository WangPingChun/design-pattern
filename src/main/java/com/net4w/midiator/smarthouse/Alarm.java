package com.net4w.midiator.smarthouse;

/**
 * @author WangPingChun
 */
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        // 在创建Alarm同事对象时，将自己放入到ConcreteMediator对象集合中
        mediator.register(name, this);
    }

    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        super.getMediator().getMessage(stateChange, super.name);
    }
}
