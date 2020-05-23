package com.net4w.chain.origin;

/**
 * @author WangPingChun
 */
public interface IWomen {
    /**
     * 获得个人情况.
     *
     * @return 个人情况
     */
    int getType();

    /**
     * 获得个人请示，你要干什么？
     *
     * @return 个人请示
     */
    String getRequest();
}
