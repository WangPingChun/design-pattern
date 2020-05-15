package com.net4w.command;

import lombok.RequiredArgsConstructor;

/**
 * @author WangPingChun
 */
@RequiredArgsConstructor
public class LightOnCommand implements Command {
    private final LightReceiver lightReceiver;

    @Override
    public void execute() {
        this.lightReceiver.on();
    }

    @Override
    public void undo() {
        this.lightReceiver.off();
    }
}
