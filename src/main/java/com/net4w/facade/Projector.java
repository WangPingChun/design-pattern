package com.net4w.facade;

/**
 * @author WangPingChun
 */
public class Projector {
    private static final Projector INSTANCE = new Projector();

    private Projector() {
    }

    public static Projector getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("Projector On");
    }

    public void off() {
        System.out.println("Projector Off");
    }

    public void focus() {
        System.out.println("Projector Is Focusing");
    }

}
