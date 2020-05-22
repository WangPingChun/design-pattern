package com.net4w.state.lift.improve;

/**
 * @author WangPingChun
 */
public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启……");
    }

    @Override
    public void close() {
        // 状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        // 动作委托为 CloseState 来执行
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
