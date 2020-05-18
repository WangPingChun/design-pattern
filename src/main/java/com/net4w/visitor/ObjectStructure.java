package com.net4w.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author WangPingChun
 */
public class ObjectStructure {
    private final List<Person> personList = new LinkedList<>();


    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void display(Action action) {
        for (Person person : personList) {
            person.accept(action);
        }
    }
}
