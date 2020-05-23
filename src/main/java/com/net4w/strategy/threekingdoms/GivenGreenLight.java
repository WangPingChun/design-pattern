package com.net4w.strategy.threekingdoms;

/**
 * @author WangPingChun
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行！");
    }
}
