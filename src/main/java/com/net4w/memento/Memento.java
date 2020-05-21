package com.net4w.memento;

import lombok.Getter;

/**
 * @author WangPingChun
 */
@Getter
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }
}
