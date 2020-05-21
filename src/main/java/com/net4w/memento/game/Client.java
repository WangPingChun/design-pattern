package com.net4w.memento.game;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        // 创建游戏角色
        final GameRole gameRole = new GameRole(100, 100);

        System.out.println("和boss大战前的状态:" + gameRole);
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战...");
        gameRole.setDef(30);
        gameRole.setAtk(30);
        System.out.println("和boss大战后的状态:" + gameRole);

        System.out.println("和boss大战后恢复");
        gameRole.restoreGameRole(caretaker.getMemento());
        System.out.println("和boss大战恢复后的状态:" + gameRole);
    }
}
