package com.net4w.iterator;

import java.util.Iterator;

/**
 * @author WangPingChun
 */
public class ComputerCollegeIterator implements Iterator<Department> {
    private final Department[] departments;
    private int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Department next() {
        final Department department = departments[position];
        position++;
        return department;
    }

    @Override
    public void remove() {

    }
}
