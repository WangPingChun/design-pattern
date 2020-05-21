package com.net4w.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @author WangPingChun
 */
@Getter
@Setter
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
