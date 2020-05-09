package com.net4w.adapter.objectadapter;

/**
 * @author WangPingChun
 */
public class VoltageAdapter implements Voltage {
    private final VoltageAtHome voltageAtHome;

    public VoltageAdapter(VoltageAtHome voltageAtHome) {
        this.voltageAtHome = voltageAtHome;
    }

    @Override
    public int output() {
        // 获取到 220v 的电压
        final int src = voltageAtHome.output();
        // 将 220v 的电压转换成 5v
        return src / 44;
    }
}
