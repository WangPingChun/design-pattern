package com.net4w.facade;

/**
 * @author WangPingChun
 */
public class Stereo {
    private static final Stereo INSTANCE = new Stereo();

    private Stereo() {
    }

    public static Stereo getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("Stereo On");
    }

    public void off() {
        System.out.println("Stereo Off");
    }

    public void pop() {
        System.out.println("Stereo Is Popping");
    }


    public void up() {
        System.out.println("Stereo Up");
    }

    public void down() {
        System.out.println("Stereo Down");
    }
}
