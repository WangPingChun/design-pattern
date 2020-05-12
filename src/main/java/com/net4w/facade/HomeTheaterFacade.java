package com.net4w.facade;

/**
 * @author WangPingChun
 */
public class HomeTheaterFacade {
    private final TheaterLight theaterLight;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final PopCorn popCorn;
    private final Stereo stereo;
    private final Screen screen;

    public HomeTheaterFacade() {
        this.screen = Screen.getInstance();
        this.dvdPlayer = DvdPlayer.getInstance();
        this.theaterLight = TheaterLight.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
    }

    public void ready() {
        popCorn.on();
        popCorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popCorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
