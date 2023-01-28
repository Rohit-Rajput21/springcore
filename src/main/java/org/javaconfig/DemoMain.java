package org.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student=context.getBean("getStudent", Student.class);
        student.study();
        System.out.println(student);
    }
}
