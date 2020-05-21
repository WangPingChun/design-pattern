package com.net4w.memento.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author WangPingChun
 */
@Getter
@Setter
@AllArgsConstructor
public class GameRole {
    private int atk;
    private int def;

    public Memento createMemento() {
        return new Memento(this.atk, this.def);
    }

    public void restoreGameRole(Memento memento) {
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    @Override
    public String toString() {
        return String.format("当前角色[{攻击力=%d, 防御力=%d}]", atk, def);
    }
}
