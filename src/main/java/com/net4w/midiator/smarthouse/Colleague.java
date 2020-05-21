package com.net4w.midiator.smarthouse;

/**
 *
 * @author WangPingChun
 */
public abstract class Colleague {
    private final Mediator mediator;
    protected final String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
