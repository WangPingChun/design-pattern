package com.net4w.facade;

/**
 * @author WangPingChun
 */
public class TheaterLight {
    private static final TheaterLight INSTANCE = new TheaterLight();

    private TheaterLight() {
    }

    public static TheaterLight getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("TheaterLight On");
    }

    public void off() {
        System.out.println("TheaterLight Off");
    }

    public void dim() {
        System.out.println("TheaterLight Dim");
    }

    public void bright() {
        System.out.println("TheaterLight Bright");
    }

}
