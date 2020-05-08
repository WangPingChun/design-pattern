package com.net4w.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        List<Sheep> sheepList = new ArrayList<>();
        // 传统的方法
        Sheep sheep = new Sheep("tom", 1, "白色");
        for (int i = 0; i < 10; i++) {
            sheepList.add(new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor()));
        }
        sheepList.forEach(System.out::println);
    }
}
