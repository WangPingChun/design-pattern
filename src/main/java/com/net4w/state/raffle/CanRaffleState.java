package com.net4w.state.raffle;

import lombok.RequiredArgsConstructor;

import java.util.Random;

/**
 * 可以抽奖的状态.
 *
 * @author WangPingChun
 */
@RequiredArgsConstructor
public class CanRaffleState implements State {
    /**
     * 用于后续改变状态.
     */
    private final RaffleActivity activity;

    @Override
    public void deductMoney() {
        System.out.println("已经扣取过积分了！");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖……");
        Random random = new Random();
        // 10%中奖概率
        int num = random.nextInt(10);
        if (num == 0) {
            // 改变状态为发放奖品
            activity.setState(activity.getDispenseState());
            return true;
        }
        System.out.println("很遗憾没有抽中奖品！");
        // 改变状态为不能抽奖
        activity.setState(activity.getNoRaffleState());
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品！");
    }
}
