package com.net4w.iterator;

import java.util.Iterator;

/**
 * @author WangPingChun
 */
public interface College {
    String getName();

    void addDepartment(String name, String desc);

    Iterator<Department> createIterator();
}
