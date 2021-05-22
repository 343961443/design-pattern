package com.zs.sample.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/22
 */
public class JDKUserServiceProxy implements InvocationHandler {

    private UserService userService;

    public JDKUserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logBefore(method);
        Object result = method.invoke(userService, args);
        logAfter(method);
        return result;
    }

    private void logBefore(Method method) {
        System.out.println(this.getClass().getName() + "开始" + method.getName() +"...");
    }

    private void logAfter(Method method) {
        System.out.println(this.getClass().getName() + "结束" + method.getName() +"...");
    }
}
