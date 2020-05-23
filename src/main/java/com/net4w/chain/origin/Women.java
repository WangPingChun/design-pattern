package com.net4w.chain.origin;

import lombok.RequiredArgsConstructor;

/**
 * @author WangPingChun
 */
@RequiredArgsConstructor
public class Women implements IWomen {
    /**
     * 1--未出嫁
     * 2--出嫁
     * 3--夫死
     */
    private final int type;
    /**
     * 妇女的请示
     */
    private final String request;

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
