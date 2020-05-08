package com.net4w.prototype.deepclone;

import lombok.Data;

import java.io.*;

/**
 * @author WangPingChun
 */
@Data
public class DeepPrototype implements Serializable, Cloneable {
    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepPrototype object = null;
        try {
            // 完成对基本数据类型和字符串的克隆
            object = (DeepPrototype) super.clone();
            // 完成
            object.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }

    /**
     * 使用对象序列化实现深拷贝
     *
     * @return
     */
    public DeepPrototype deepClone() {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);) {
            // 当前对象以对象流的方式输出
            objectOutputStream.writeObject(this);

            // 反序列化
            try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                 ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);) {
                return (DeepPrototype) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
