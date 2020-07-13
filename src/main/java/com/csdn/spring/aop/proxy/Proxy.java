package com.csdn.spring.aop.proxy;

/**
 * 代理{@link Subject}对象
 *
 * @author ：xwf
 * @date ：Created in 2020\7\13 0013 21:28
 */
public class Proxy {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        preOperation();
        subject.request();
        postOperation();
    }

    private void postOperation() {
        System.out.println("后置处理...");
    }

    private void preOperation() {
        System.out.println("前置处理...");
    }
}
