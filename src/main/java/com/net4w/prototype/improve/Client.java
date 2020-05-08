package com.net4w.prototype.improve;


import java.util.ArrayList;
import java.util.List;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Sheep> sheepList = new ArrayList<>();
        // 传统的方法
        Sheep tom = new Sheep("tom", 1, "白色");
        for (int i = 0; i < 10; i++) {
            sheepList.add((Sheep) tom.clone());
        }
        sheepList.forEach(sheep -> {
            System.out.println(sheep == tom);
        });
    }
}
