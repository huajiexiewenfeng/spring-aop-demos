package com.csdn.spring.aop.proxy;

/**
 * {@link Subject} 默认实现
 *
 * @author ：xwf
 * @date ：Created in 2020\7\13 0013 21:29
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("request 方法执行");
    }
}
