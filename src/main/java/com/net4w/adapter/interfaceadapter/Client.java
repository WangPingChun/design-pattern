package com.net4w.adapter.interfaceadapter;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        final AbsAdapter adapter = new AbsAdapter() {
            // 只需要去覆盖我们需要使用的方法
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };

        adapter.m1();
    }
}
