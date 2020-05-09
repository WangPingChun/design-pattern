package com.net4w.builder;

/**
 * @author WangPingChun
 */
public abstract class AbstractHouse {
    /**
     * 打地基.
     */
    protected abstract void buildBasic();

    /**
     * 砌墙.
     */
    protected abstract void buildWall();

    /**
     * 封顶.
     */
    protected abstract void roofed();

    public final void build() {
        this.buildBasic();
        this.buildWall();
        this.roofed();
    }
}
