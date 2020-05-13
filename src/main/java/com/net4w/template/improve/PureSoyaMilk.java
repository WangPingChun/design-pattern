package com.net4w.template.improve;

/**
 * @author WangPingChun
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    protected void addCondiments() {
        System.out.println("不添加任何东西");
    }

    @Override
    protected boolean customerWantCondiments() {
        return false;
    }
}
