package com.net4w.state.raffle;

import lombok.RequiredArgsConstructor;

/**
 * 奖品发放完毕的状态.
 *
 * @author WangPingChun
 */
@RequiredArgsConstructor
public class DispenseOutState implements State {
    /**
     * 用于后续改变状态.
     */
    private final RaffleActivity activity;

    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了,请下次再参加!");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了,请下次再参加!");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了,请下次再参加!");
    }
}
