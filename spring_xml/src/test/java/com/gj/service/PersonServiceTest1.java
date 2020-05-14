package com.gj.service;

import com.gj.domain.Account;
import com.gj.domain.Animal;
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
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring.xml");
//        IPersonService personService=(IPersonService)applicationContext.getBean("personService");
//        System.out.println(personService);
//
//        Resource resource=new ClassPathResource("spring.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);
//        IPersonService personService1=(IPersonService)factory.getBean("personService");
//        System.out.println(personService1);

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring.xml");
        Account account1=(Account)applicationContext.getBean("account1");
        System.out.println(account1);

        Account account2=(Account)applicationContext.getBean("com.gj.domain.Account#1");
        System.out.println(account2);

        Account account3=(Account)applicationContext.getBean("com.gj.domain.Account#0");
        System.out.println(account3);

        Animal animal=(Animal)applicationContext.getBean("animal");
        System.out.println(animal);

//        String[] beans=applicationContext.getBeanDefinitionNames();
//
//        for (String beanName:beans) {
//            System.out.println();
//        }
    }
}
