package com.net4w.chain.origin;

/**
 * @author WangPingChun
 */
public interface IHandler {
    /**
     * 一个女性要求逛街，你要处理这个请求
     *
     * @param women 处理请求
     */
    void handleMessage(IWomen women);
}
