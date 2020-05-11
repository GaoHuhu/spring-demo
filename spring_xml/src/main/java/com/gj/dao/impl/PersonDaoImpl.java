package com.gj.dao.impl;

import com.gj.dao.IPersonDao;
import com.gj.domain.Person;

public class PersonDaoImpl implements IPersonDao {
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void sayHello() {
        System.out.println("hello spring!");
        System.out.println(person.toString());
    }
}
