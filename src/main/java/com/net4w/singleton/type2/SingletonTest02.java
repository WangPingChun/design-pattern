package com.net4w.singleton.type2;

/**
 * 这种单例模式可用，但是可能造成内存浪费
 *
 * @author WangPingChun
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        // 测试
        final Singleton instance = Singleton.getInstance();
        final Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}

/**
 * 饿汉式（静态代码块）
 */
class Singleton {

    /**
     * 1.构造器私有化
     */
    private Singleton() {

    }

    /**
     * 2.本类内部创建对象实例
     */
    private final static Singleton INSTANCE;

    static {
        // 在静态代码块中创建单例对象
        INSTANCE = new Singleton();
    }

    /**
     * 3.提供一个公有的静态方法，返回实例对象
     *
     * @return
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }
}