package com.net4w.midiator.smarthouse;

/**
 * @author WangPingChun
 */
public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        super.getMediator().getMessage(stateChange, super.name);
    }

    public void upCurtains() {
        System.out.println("I am holding up curtains!");
    }
}
