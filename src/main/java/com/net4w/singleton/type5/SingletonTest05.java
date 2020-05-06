package com.net4w.singleton.type5;

/**
 * 在实际开发中，推荐使用这种单例设计模式
 *
 * @author WangPingChun
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        final Singleton instance1 = Singleton.getInstance();
        final Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

class Singleton {
    /**
     * volatile禁止了指令重排序
     */
    private static volatile Singleton instance;

    private Singleton() {

    }

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
     * 同时保证了效率
     *
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
