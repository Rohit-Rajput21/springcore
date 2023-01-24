package org.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        context.registerShutdownHook();
        Samosa s1=(Samosa) context.getBean("s1");
        System.out.println(s1);
        System.out.println("++++++++++++++++++++++++++++");
        Pepsi p1=(Pepsi) context.getBean("p1");
        System.out.println(p1);
    }
}