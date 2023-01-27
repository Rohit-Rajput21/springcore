package org.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beanscopeconfig.xml");
        Student student=context.getBean("ob", Student.class);
        System.out.println(student.hashCode());
        Student student1=context.getBean("ob", Student.class);
        System.out.println(student1.hashCode());
        System.out.println("___________________________________________");
        Teacher teacher=context.getBean("teacher1", Teacher.class);
        System.out.println(teacher.hashCode());
        Teacher teacher1=context.getBean("teacher1", Teacher.class);
        System.out.println(teacher1.hashCode());


    }
}
