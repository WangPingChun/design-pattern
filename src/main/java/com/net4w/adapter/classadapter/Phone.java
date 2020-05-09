package com.net4w.adapter.classadapter;

/**
 * @author WangPingChun
 */
public class Phone {
    /**
     * 需要的充电电压
     */
    private static final int NEED_VOLTAGE = 5;

    public void charging(Voltage voltage) {
        if (voltage.output() == NEED_VOLTAGE) {
            System.out.println("可以充电");
        } else {
            System.err.println("不可以充电");
        }
    }
}
