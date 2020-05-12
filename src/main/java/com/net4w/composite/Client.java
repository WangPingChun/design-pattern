package com.net4w.composite;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        // 从大到小
        final OrganizationComponent university = new University("清华大学", "中国顶级大学");

        // 创建学院
        final OrganizationComponent computerCollage = new Collage("计算机学院", "计算机学院");
        final OrganizationComponent infoEngineerCollage = new Collage("信息工程学院", "信息工程学院");

        // 创建各个学院下面的系
        computerCollage.add(new Department("软件工程", "软件工程"));
        computerCollage.add(new Department("网络工程", "网络工程"));
        computerCollage.add(new Department("计算机科学与计算", "计算机科学与计算"));

        infoEngineerCollage.add(new Department("通信工程", "通信工程"));
        infoEngineerCollage.add(new Department("信息工程", "信息工程"));

        // 将学院加入到学校
        university.add(computerCollage);
        university.add(infoEngineerCollage);


        university.print();
    }
}
