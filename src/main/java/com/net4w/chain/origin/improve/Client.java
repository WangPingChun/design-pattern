package com.net4w.chain.origin.improve;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        // 随机挑选几个女性
        Random random = new Random();
        List<IWomen> womenList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            womenList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        // 定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        // 设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : womenList) {
            father.handlerMessage(women);
        }
    }
}
