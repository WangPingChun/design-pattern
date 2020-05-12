package com.net4w.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangPingChun
 */
public class Collage extends OrganizationComponent {
    private final List<OrganizationComponent> departmentList = new ArrayList<>();

    public Collage(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        departmentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        departmentList.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("\t\t" + getName());
        for (OrganizationComponent department : departmentList) {
            department.print();
        }
    }
}
