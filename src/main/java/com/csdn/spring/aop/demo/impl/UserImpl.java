package com.csdn.spring.aop.demo.impl;

import com.csdn.spring.aop.demo.User;
import com.csdn.spring.aop.demo.service.UserService;

/**
 * @author ：xwf
 * @date ：Created in 2020-7-16 10:20
 */
public class UserImpl implements UserService {

    @Override
    public User getUser() {
        return new User(1L, "xwf");
    }

}
