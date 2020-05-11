package com.net4w.bridge;

/**
 * @author WangPingChun
 */
public abstract class Phone {
    protected Memory memory;

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public abstract void buyPhone();
}
