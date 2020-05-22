package com.net4w.state.lift.improve;

/**
 * @author WangPingChun
 */
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯上下运行……");
    }

    @Override
    public void stop() {
        // 状态修改
        super.context.setLiftState(Context.STOPPING_STATE);
        // 动作委托为 CloseState 来执行
        super.context.getLiftState().stop();
    }
}
