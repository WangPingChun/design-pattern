package com.net4w.state.raffle;

/**
 * 不能抽奖的状态.
 *
 * @author WangPingChun
 */
public class NoRaffleState implements State {
    /**
     * 用于后续改变状态.
     */
    private final RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        // 当前状态可以扣积分
        System.out.println("扣除50积分成功，您可以抽奖了");
        // 扣除后将状态设置成可以抽奖的状态
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        // 当前状态不能抽奖
        System.out.println("扣了积分才能抽奖哟！");
        return false;
    }

    @Override
    public void dispensePrize() {
        // 当前状态不能发放奖品
        System.out.println("不能发放奖品！");
    }
}
