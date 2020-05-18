package com.net4w.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author WangPingChun
 */
public class InfoCollegeIterator implements Iterator<Department> {
    private final List<Department> departments;
    private int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        } else {
            index++;
            return true;
        }
    }

    @Override
    public Department next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
