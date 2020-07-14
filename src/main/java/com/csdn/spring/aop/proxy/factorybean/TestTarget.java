package com.csdn.spring.aop.proxy.factorybean;

/**
 * @author ：xwf
 * @date ：Created in 2020-7-14 12:01
 */
public class TestTarget implements TestInterface{
    @Override
    public void hello() {
        System.out.println("hello,world");
    }
}
