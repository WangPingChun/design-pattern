package com.net4w.prototype.deepclone;

import lombok.AllArgsConstructor;

import java.io.Serializable;

/**
 * @author WangPingChun
 */
@AllArgsConstructor
public class DeepCloneableTarget implements Serializable, Cloneable {
    private final String cloneName;
    private final String cloneClass;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
