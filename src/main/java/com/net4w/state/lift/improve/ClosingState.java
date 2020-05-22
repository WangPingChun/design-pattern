package com.net4w.state.lift.improve;

/**
 * @author WangPingChun
 */
public class ClosingState extends LiftState {
    @Override
    public void open() {
        // 状态修改
        super.context.setLiftState(Context.OPENING_STATE);
        // 动作委托为 CloseState 来执行
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭……");
    }

    @Override
    public void run() {
        // 状态修改
        super.context.setLiftState(Context.RUNNING_STATE);
        // 动作委托为 CloseState 来执行
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        // 状态修改
        super.context.setLiftState(Context.STOPPING_STATE);
        // 动作委托为 CloseState 来执行
        super.context.getLiftState().stop();
    }
}
