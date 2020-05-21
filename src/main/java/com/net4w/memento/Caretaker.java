package com.net4w.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WangPingChun
 */
public class Caretaker {
    private final Map<String, Memento> mementoMap = new HashMap<>();

    public void setMemento(String idx, Memento memento) {
        mementoMap.put(idx, memento);
    }

    public Memento getMemento(String idx) {
        return mementoMap.get(idx);
    }
}
