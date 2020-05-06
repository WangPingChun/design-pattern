package com.net4w.singleton.type4;

/**
 * 在实际开发中，不推荐使用这种方式（效率太低）
 *
 * @author WangPingChun
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        final Singleton instance1 = Singleton.getInstance();
        final Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    /**
     * 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
     *
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
