package com.csdn.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Java 动态代理示例
 *
 * @author ：xwf
 * @date ：Created in 2020\7\13 0013 21:48
 */
public class DynamicProxyDemo {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxyInstance = (Subject) java.lang.reflect.Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                new Class<?>[]{Subject.class},
                new InvocationHandlerImpl(subject));
        proxyInstance.request();
    }

    static class InvocationHandlerImpl implements InvocationHandler {

        private Object target;

        public InvocationHandlerImpl(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object reuslt = null;
            postOperation();
            reuslt = method.invoke(target, args);
            preOperation();
            return reuslt;
        }

        private void postOperation() {
            System.out.println("后置处理...");
        }

        private void preOperation() {
            System.out.println("前置处理...");
        }
    }

}
