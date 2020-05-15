package com.net4w.command;

import lombok.RequiredArgsConstructor;

/**
 * @author WangPingChun
 */
@RequiredArgsConstructor
public class TelevisionOffCommand implements Command {
    private final TelevisionReceiver televisionReceiver;

    @Override
    public void execute() {
        this.televisionReceiver.off();
    }

    @Override
    public void undo() {
        this.televisionReceiver.on();
    }
}
