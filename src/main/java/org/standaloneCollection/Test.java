package org.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("standaloneconfig.xml");
        People people1=context.getBean("people1", People.class);
        System.out.println(people1);
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(people1.getFriends());
        System.out.println(people1.getFriends().getClass().getName());
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(people1.getFeestructure());
        System.out.println(people1.getFeestructure().getClass().getName());
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(people1.getProperties());
        System.out.println(people1.getProperties().getClass().getName());
    }
}
