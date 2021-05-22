package com.zs.sample.design.proxy;

import java.lang.reflect.Method;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/22
 */
public class StaticUserServiceProxy implements UserService {
    private UserService userService;

    public StaticUserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    private void logBefore(String name) {
        System.out.println(this.getClass().getName() + "开始" + name +"...");
    }

    private void logAfter(String name) {
        System.out.println(this.getClass().getName() + "结束" + name +"...");
    }

    public void createUser() {

        logBefore("createUser");
        userService.createUser();
        logAfter("createUser");
    }

    public void updateUser() {
        logBefore("updateUser");
        userService.updateUser();
        logAfter("updateUser");
    }
}
