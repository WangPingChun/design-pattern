package com.net4w.state.raffle;

import lombok.RequiredArgsConstructor;

/**
 * 发放奖品的状态.
 *
 * @author WangPingChun
 */
@RequiredArgsConstructor
public class DispenseState implements State {
    /**
     * 用于后续改变状态.
     */
    private final RaffleActivity activity;

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分！");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖！");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖了");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发送完了……");
            // 改变状态为奖品发送完毕
            activity.setState(activity.getDispenseOutState());
        }
    }
}
