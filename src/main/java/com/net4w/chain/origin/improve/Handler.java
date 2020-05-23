package com.net4w.chain.origin.improve;


/**
 * @author WangPingChun
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    /**
     * 能处理的级别.
     */
    private final int level;
    /**
     * 责任传递，下一个责任人是谁
     */
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }


    public final void handlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                // 有后续环节，才把请求往后递送
                this.nextHandler.handlerMessage(women);
            } else {
                // 已经没有后续处理人了，不用处理了
                System.out.println("---没地方请示了，按不同意处理---\n");
            }
        }
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    protected abstract void response(IWomen women);
}
