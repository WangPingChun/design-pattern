package com.net4w.visitor;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());

        final Success success = new Success();
        objectStructure.display(success);
    }
}
