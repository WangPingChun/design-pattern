package com.net4w.prototype.deepclone;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        final DeepPrototype origin = new DeepPrototype();
        origin.setName("test");
        origin.setDeepCloneableTarget(new DeepCloneableTarget("xxx", "xxx.java"));

        // 方式1完成深拷贝
        DeepPrototype clone = (DeepPrototype) origin.clone();
        System.out.println("\n方式1完成深拷贝:");
        System.out.println(String.format("原始对象的信息: name = %s, deepCloneableTarget.hashCode = %s", origin.getName(), origin.getDeepCloneableTarget().hashCode()));
        System.out.println(String.format("克隆对象的信息: name = %s, deepCloneableTarget.hashCode = %s", clone.getName(), clone.getDeepCloneableTarget().hashCode()));

        // 方式2完成深拷贝
        clone = origin.deepClone();
        System.out.println("\n方式2完成深拷贝:");
        System.out.println(String.format("原始对象的信息: name = %s, deepCloneableTarget.hashCode = %s", origin.getName(), origin.getDeepCloneableTarget().hashCode()));
        System.out.println(String.format("克隆对象的信息: name = %s, deepCloneableTarget.hashCode = %s", clone.getName(), clone.getDeepCloneableTarget().hashCode()));
    }
}
