package com.net4w.builder.improve;

/**
 * 抽象建造者
 *
 * @author WangPingChun
 */
public abstract class HouseBuilder {
    protected House house = new House();

    protected abstract void base();

    protected abstract void wall();

    protected abstract void roofed();

    /**
     * 将产品返回.
     *
     * @return
     */
    public House build() {
        return this.house;
    }
}
