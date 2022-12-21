package com.AOP.annoation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testLogAspect {
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annoation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1,1);
    }
}
