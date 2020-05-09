package com.net4w.adapter.classadapter;

/**
 * @author WangPingChun
 */
public class VoltageAdapter extends VoltageAtHome implements Voltage {
    @Override
    public int output() {
        // 获取到 220v 的电压
        final int src = super.output();
        // 将 220v 的电压转换成 5v
        return src / 44;
    }
}
