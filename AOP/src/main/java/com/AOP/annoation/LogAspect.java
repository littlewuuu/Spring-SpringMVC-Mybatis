package com.AOP.annoation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Before("execution(public int com.AOP.annoation.CalculatorPureImpl.add(int,int))")
    public void beforeMethod(){
        System.out.printf("beforeMethod");
    }
}
