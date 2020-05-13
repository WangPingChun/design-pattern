package com.net4w.proxy.dynamic.jdk;


/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        final ITeacherDao teacherDao = new TeacherDao();
        final ProxyFactory<ITeacherDao> proxyFactory = new ProxyFactory<>(teacherDao);
        final ITeacherDao proxyInstance = proxyFactory.getProxyInstance();
        System.out.println("内存中生成的代理对象为:" + proxyInstance.getClass());
        // 通过代理对象调用目标对象的方法
        proxyInstance.teach();
    }
}
