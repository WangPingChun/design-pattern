package com.net4w.proxy;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        final TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
        // 通过代理对象，调用到被代理对象的方法
        proxy.teach();
    }
}
