package com.net4w.singleton.type3;

/**
 * 在实际开发中，不要使用这种方式
 *
 * @author WangPingChun
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        final Singleton instance1 = Singleton.getInstance();
        final Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    /**
     * 提供一个静态的公有方法，当使用时才会创建instance
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
