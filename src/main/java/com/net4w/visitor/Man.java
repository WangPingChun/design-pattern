package com.net4w.visitor;

/**
 * @author WangPingChun
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getResult(this);
    }
}
