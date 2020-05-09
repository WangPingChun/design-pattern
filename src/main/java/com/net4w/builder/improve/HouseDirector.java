package com.net4w.builder.improve;

import lombok.Setter;

/**
 * @author WangPingChun
 */
@Setter
public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.base();
        houseBuilder.wall();
        houseBuilder.roofed();
        return houseBuilder.build();
    }
}
