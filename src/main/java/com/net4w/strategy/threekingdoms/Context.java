package com.net4w.strategy.threekingdoms;

import lombok.RequiredArgsConstructor;

/**
 * @author WangPingChun
 */
@RequiredArgsConstructor
public class Context {
    private final IStrategy strategy;

    public void operate() {
        this.strategy.operate();
    }
}
