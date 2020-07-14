package com.csdn.spring.aop.proxy;



/**
 * 客户端
 *
 * @author ：xwf
 * @date ：Created in 2020\7\13 0013 21:31
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
