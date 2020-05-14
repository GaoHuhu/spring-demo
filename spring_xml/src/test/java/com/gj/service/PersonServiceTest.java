package com.gj.service;

import com.gj.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class PersonServiceTest {
    @Resource
    private IPersonService personService;

    @Test
    public void sayHelloTest(){
        personService.sayHello();
    }
}