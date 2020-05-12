package com.net4w.facade;

/**
 * @author WangPingChun
 */
public class DvdPlayer {
    private static final DvdPlayer INSTANCE = new DvdPlayer();

    private DvdPlayer() {
    }

    public static DvdPlayer getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("DvdPlayer On");
    }

    public void off() {
        System.out.println("DvdPlayer Off");
    }

    public void play() {
        System.out.println("DvdPlayer Is Playing");
    }

    public void pause() {
        System.out.println("DvdPlayer Pause");
    }
}
