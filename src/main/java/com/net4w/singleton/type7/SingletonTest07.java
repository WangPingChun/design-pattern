package com.net4w.singleton.type7;

/**
 * 在实际开发中，推荐使用
 *
 * @author WangPingChun
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("单例模式--枚举");
        final Singleton instance1 = Singleton.INSTANCE;
        final Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}

/**
 * 使用枚举，可以实现单例
 */
enum Singleton {
    INSTANCE;

    public void sayOk() {
        System.out.println("ok~");
    }
}
