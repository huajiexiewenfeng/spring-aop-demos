package com.csdn.spring.aop.demo.profiler;


import org.aspectj.lang.JoinPoint;

/**
 * @author ：xwf
 * @date ：Created in 2020-7-16 10:28
 */
public class DefaultProfiler {

    public void beforeAdvice(JoinPoint call) throws Throwable {
        System.out.println("前置通知");
    }
}
