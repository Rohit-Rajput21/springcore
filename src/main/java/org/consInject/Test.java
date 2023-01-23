package org.consInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("consconfig.xml");
        People p=(People)applicationContext.getBean("person");
        System.out.println(p);
    }
}
