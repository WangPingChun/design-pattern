package com.net4w.state.raffle;

/**
 * 状态接口.
 *
 * @author WangPingChun
 */
public interface State {
    /**
     * 扣除积分.
     */
    void deductMoney();

    /**
     * 是否抽中奖品.
     *
     * @return 是否抽中奖品
     */
    boolean raffle();

    /**
     * 发放奖品
     */
    void dispensePrize();
}
