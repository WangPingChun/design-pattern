package com.net4w.template;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        // 制作红豆豆浆
        System.out.println("========= 开始制作红豆豆浆 =========");
        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        // 制作花生豆浆
        System.out.println("========= 开始制作花生豆浆 =========");
        final PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
