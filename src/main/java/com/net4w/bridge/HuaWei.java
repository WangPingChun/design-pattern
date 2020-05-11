package com.net4w.bridge;

/**
 * @author WangPingChun
 */
public class HuaWei extends Phone {
    @Override
    public void buyPhone() {
        // memory 是继承自父类调用的 setMemory 中的方法
        super.memory.addMemory();
        System.out.println("购买华为手机");
    }
}
