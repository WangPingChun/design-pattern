package com.net4w.adapter.classadapter;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
