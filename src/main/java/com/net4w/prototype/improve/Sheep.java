package com.net4w.prototype.improve;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author WangPingChun
 */
@Data
@AllArgsConstructor
public class Sheep implements Cloneable {
    private final String name;
    private final int age;
    private final String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
