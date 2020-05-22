package com.net4w.state.lift;

/**
 * @author WangPingChun
 */
public class Lift implements ILift {
    private int state;

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                // do nothing
                break;
            // 闭门状态，可以开启
            case CLOSING_STATE:
                // 停止状态，当然要开门了
            case STOPPING_STATE:
                this.openWithoutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                // 运行状态，则不能开门，什么都不做
                // do nothing
                break;
            default:
                // do nothing
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithoutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
            case RUNNING_STATE:
                break;
            default:
                // do nothing
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
            case RUNNING_STATE:
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            default:
                // do nothing
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
            case STOPPING_STATE:
                break;
            case RUNNING_STATE:
            case CLOSING_STATE:
                this.runWithoutLogic();
                this.setState(RUNNING_STATE);
                break;
            default:
                // do nothing
        }
    }

    @Override
    public void setState(int state) {
        this.state = state;
    }

    private void closeWithoutLogic() {
        System.out.println("电梯门关闭...");
    }

    private void openWithoutLogic() {
        System.out.println("电梯门开启...");
    }

    private void runWithoutLogic() {
        System.out.println("电梯上下运行起来...");
    }

    private void stopWithoutLogic() {
        System.out.println("电梯门停止了...");
    }
}
