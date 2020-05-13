package com.net4w.proxy.dynamic.cglib;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        final TeacherDao target = new TeacherDao();
        final ProxyFactory proxyFactory = new ProxyFactory(target);
        final TeacherDao proxyInstance = (TeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
