package com.net4w.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author WangPingChun
 */
public class OutPutImpl {
    private final List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printCollege() {
        for (College college : colleges) {
            System.out.println("==== " + college.getName() + " ====");
            printDepartment(college.createIterator());
            System.out.println();
        }
    }

    public void printDepartment(Iterator<Department> iterator) {
        while (iterator.hasNext()) {
            final Department department = iterator.next();
            System.out.println(department.getName());
        }
    }
}
