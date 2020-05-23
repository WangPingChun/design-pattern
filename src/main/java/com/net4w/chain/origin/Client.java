package com.net4w.chain.origin;

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
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen women : womenList) {
            if (women.getType() == 1) {
                System.out.println("\n--------女儿向父亲请示--------");
                father.handleMessage(women);
            } else if (women.getType() == 2) {
                System.out.println("\n--------妻子向丈夫请示--------");
                husband.handleMessage(women);
            } else if (women.getType() == 3) {
                System.out.println("\n--------母亲向儿子请示--------");
                son.handleMessage(women);
            } else {
                // do nothing
            }
        }
    }
}
