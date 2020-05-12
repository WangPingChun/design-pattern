package com.net4w.composite;

import lombok.Getter;
import lombok.Setter;

/**
 * @author WangPingChun
 */
@Getter
@Setter
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    protected abstract void add(OrganizationComponent organizationComponent);

    protected abstract void remove(OrganizationComponent organizationComponent);

    protected abstract void print();
}
