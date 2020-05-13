package com.net4w.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * @author WangPingChun
 */
public class ProxyFactory<T> {
    private final T target;

    public ProxyFactory(T target) {
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public T getProxyInstance() {
        // ClassLoader loader: 指定当前目标的类加载器，获取加载器的方法固定
        // Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方式确认类型
        // InvocationHandler h: 事件处理，执行目标对象的方法时会触发事件处理器的方法
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("JDK代理开始。。。");
            final Object invoke = method.invoke(target, args);
            System.out.println("JDK代理结束，返回值为:" + invoke);
            return invoke;
        });
    }
}
