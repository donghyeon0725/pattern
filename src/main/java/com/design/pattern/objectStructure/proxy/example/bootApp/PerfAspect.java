package com.design.pattern.objectStructure.proxy.example.bootApp;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 스프링이 관리하는 Bean 만 프록시로 사용할 수 있음
 * */
@Aspect
@Component
public class PerfAspect {
    @Around("bean(defaultGameService)")
    public void timestamp(ProceedingJoinPoint point) throws Throwable {
        long before = System.currentTimeMillis();
        point.proceed();
        System.out.println(System.currentTimeMillis() - before);
    }
}
