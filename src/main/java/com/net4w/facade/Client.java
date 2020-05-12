package com.net4w.facade;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        final HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println();
        homeTheaterFacade.play();
        System.out.println();
        homeTheaterFacade.end();
    }
}
