package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello");

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("config.xml");
       Student student1 =(Student)applicationContext.getBean("student1");
       Student student2 =(Student)applicationContext.getBean("student2");
        System.out.println(student1);
        System.out.println(student2);
    }
}
