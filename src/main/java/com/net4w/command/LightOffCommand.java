package com.net4w.command;

import lombok.RequiredArgsConstructor;

/**
 * @author WangPingChun
 */
@RequiredArgsConstructor
public class LightOffCommand implements Command {
    private final LightReceiver lightReceiver;

    @Override
    public void execute() {
        this.lightReceiver.off();
    }

    @Override
    public void undo() {
        this.lightReceiver.on();
    }
}
