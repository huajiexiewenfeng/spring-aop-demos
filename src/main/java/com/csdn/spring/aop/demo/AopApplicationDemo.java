package com.csdn.spring.aop.demo;

import com.csdn.spring.aop.demo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application 启动示例，含 AOP 配置
 *
 * @author ：xwf
 * @date ：Created in 2020-7-16 10:01
 */
public class AopApplicationDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/spring-aop-demo.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        User user = userService.getUser();
        System.out.println(user.toString());
    }
}
