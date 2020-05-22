package com.net4w.state.lift.improve;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        final Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
