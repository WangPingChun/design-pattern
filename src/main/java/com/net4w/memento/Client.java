package com.net4w.memento;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();
        originator.setState("1");

        System.out.println("原始的状态值：" + originator.getState());
        // 保存了当前的状态
        caretaker.setMemento("001", originator.createMemento());

        originator.setState("2");
        System.out.println("新设置的状态值：" + originator.getState());

        // 恢复
        originator.restoreMemento(caretaker.getMemento("001"));
        System.out.println("恢复之后的状态值：" + originator.getState());
    }
}
