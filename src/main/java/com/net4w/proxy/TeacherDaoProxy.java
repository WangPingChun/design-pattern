package com.net4w.proxy;

/**
 * @author WangPingChun
 */
public class TeacherDaoProxy implements ITeacherDao {
    private final ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代课老师开始上课。。。");
        target.teach();
        System.out.println("代课老师结束上课。。。");
    }
}
