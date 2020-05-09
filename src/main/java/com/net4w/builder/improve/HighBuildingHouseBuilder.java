package com.net4w.builder.improve;

/**
 * @author WangPingChun
 */
public class HighBuildingHouseBuilder extends HouseBuilder {
    @Override
    protected void base() {
        super.house.setBase("20m");
    }

    @Override
    protected void wall() {
        super.house.setWall("20m");
    }

    @Override
    protected void roofed() {
        super.house.setRoofed("平顶");
    }
}
