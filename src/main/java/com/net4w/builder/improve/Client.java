package com.net4w.builder.improve;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        // 该普通房子
        final CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        final HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
        House house = houseDirector.constructHouse();
        System.out.println(String.format("普通房子: %s", house));

        // 设置高楼大厦
        HighBuildingHouseBuilder highBuildingHouseBuilder = new HighBuildingHouseBuilder();
        houseDirector.setHouseBuilder(highBuildingHouseBuilder);
        house = houseDirector.constructHouse();
        System.out.println(String.format("高楼大厦: %s", house));
    }
}
