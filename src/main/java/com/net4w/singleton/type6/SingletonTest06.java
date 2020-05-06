package com.net4w.singleton.type6;

/**
 * 在实际开发中，推荐使用
 *
 * @author WangPingChun
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("单例模式--静态内部类");
        final Singleton instance1 = Singleton.getInstance();
        final Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

class Singleton {

    /**
     * 构造器私有化
     */
    private Singleton() {

    }

    /**
     * 静态内部类特点：
     * 1.外部类被装载时内部类并不会被装载
     * 2.类装载时线程是安全的
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * @return
     */
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
