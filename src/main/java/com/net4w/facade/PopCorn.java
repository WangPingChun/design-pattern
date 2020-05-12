package com.net4w.facade;

/**
 * @author WangPingChun
 */
public class PopCorn {
    private static final PopCorn INSTANCE = new PopCorn();

    private PopCorn() {
    }

    public static PopCorn getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("PopCorn On");
    }

    public void off() {
        System.out.println("PopCorn Off");
    }

    public void pop() {
        System.out.println("PopCorn Is Popping");
    }

}
