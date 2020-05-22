package com.net4w.state.lift;

/**
 * @author WangPingChun
 */
public interface ILift {
    /**
     * 敞门状态.
     */
    int OPENING_STATE = 1;
    /**
     * 闭门状态.
     */
    int CLOSING_STATE = 2;
    /**
     * 运行状态.
     */
    int RUNNING_STATE = 3;
    /**
     * 停止状态.
     */
    int STOPPING_STATE = 4;

    /**
     * 首先电梯门开启动作.
     */
    void open();

    /**
     * 电梯门可以开启，那当然也就可以关闭了.
     */
    void close();

    /**
     * 电梯要能上能下
     */
    void run();

    /**
     * 电梯还要能停下来.
     */
    void stop();

    /**
     * 设置电梯的状态.
     *
     * @param state 状态
     */
    void setState(int state);

}
