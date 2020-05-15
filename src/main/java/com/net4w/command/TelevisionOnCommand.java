package com.net4w.command;

import lombok.RequiredArgsConstructor;

/**
 * @author WangPingChun
 */
@RequiredArgsConstructor
public class TelevisionOnCommand implements Command {
    private final TelevisionReceiver televisionReceiver;

    @Override
    public void execute() {
        this.televisionReceiver.on();
    }

    @Override
    public void undo() {
        this.televisionReceiver.off();
    }
}
