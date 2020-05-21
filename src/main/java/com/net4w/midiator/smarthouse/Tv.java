package com.net4w.midiator.smarthouse;

/**
 * @author WangPingChun
 */
public class Tv extends Colleague {
    public Tv(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        super.getMediator().getMessage(stateChange, super.name);
    }

    public void startTv() {
        System.out.println("It's time to start tv！");
    }

    public void stopTv() {
        System.out.println("It's time to stop tv！");
    }
}
