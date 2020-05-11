package com.net4w.bridge;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        // 让华为手机搭配8G内存
        Phone huawei = new HuaWei();
        huawei.setMemory(new Memory8G());
        huawei.buyPhone();

        // 让小米手机搭配6G内存
        Phone mi = new Mi();
        mi.setMemory(new Memory6G());
        mi.buyPhone();
    }
}
