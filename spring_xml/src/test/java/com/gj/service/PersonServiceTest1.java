package com.gj.service;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PersonServiceTest1 {
    @Test
    public void sayHelloTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring.xml");
        IPersonService personService=(IPersonService)applicationContext.getBean("personService");
        System.out.println(personService);

        Resource resource=new ClassPathResource("spring.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        IPersonService personService1=(IPersonService)factory.getBean("personService");
        System.out.println(personService1);
    }
}
