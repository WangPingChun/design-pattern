package com.net4w.visitor;

/**
 * @author WangPingChun
 */
public class Fail extends Action {
    @Override
    public void getResult(Man man) {
        System.out.println("男人给的评价是失败");
    }

    @Override
    public void getResult(Woman woman) {
        System.out.println("女人给的评价是失败");
    }
}
