package com.net4w.builder.improve;

/**
 * @author WangPingChun
 */
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    protected void base() {
        super.house.setBase("10m");
    }

    @Override
    protected void wall() {
        super.house.setWall("10m");
    }

    @Override
    protected void roofed() {
        super.house.setRoofed("尖顶");
    }
}
