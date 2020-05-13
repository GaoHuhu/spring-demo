package com.gj.service.impl;

import com.gj.dao.IPersonDao;
import com.gj.service.IPersonService;

public class PersonService implements IPersonService {

    public void setPersonDao(IPersonDao personDao) {
        this.personDao = personDao;
    }

    public PersonService() {
        System.out.println("对象创建了");
    }

    private IPersonDao personDao;

    public void sayHello() {
        personDao.sayHello();
    }
}
