package com.net4w.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangPingChun
 */
public class University extends OrganizationComponent {
    private final List<OrganizationComponent> collageList = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        collageList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        collageList.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("\t" + getName());
        for (OrganizationComponent organizationComponent : collageList) {
            organizationComponent.print();
        }
    }
}
