package com.net4w.facade;

/**
 * @author WangPingChun
 */
public class Screen {
    private static final Screen INSTANCE = new Screen();

    private Screen() {
    }

    public static Screen getInstance() {
        return INSTANCE;
    }

    public void up() {
        System.out.println("Screen Up");
    }

    public void down() {
        System.out.println("Screen Down");
    }

}
