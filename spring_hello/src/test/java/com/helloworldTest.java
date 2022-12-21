package com;

import com.wu.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class helloworldTest {
    @Test
    public void test() {
        //1 获取 ioc
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2 通过ioc 获取 bean
        HelloWorld helloworld = (HelloWorld) ioc.getBean("helloworld");
        helloworld.sayHello();
    }

    /**
     * 反射的基本使用
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @Test
    public void getObject() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("com.wu.HelloWorld");
        Object object =clazz.newInstance();
        Method method = clazz.getMethod("sayHello");
        method.invoke(object);
    }

}
