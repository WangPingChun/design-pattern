package com.net4w.composite;

/**
 * 叶子节点
 *
 * @author WangPingChun
 */
public class Department extends OrganizationComponent {
    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void print() {
        System.out.println("\t\t\t" + getName());
    }
}
