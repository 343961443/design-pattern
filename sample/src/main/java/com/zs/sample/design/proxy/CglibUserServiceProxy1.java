package com.zs.sample.design.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/22
 */
public class CglibUserServiceProxy1 implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        logBefore(method);
        Object object = methodProxy.invokeSuper(o, objects);
        logAfter(method);
        return object;
    }
    private void logBefore(Method method) {
        System.out.println(this.getClass().getName() + "开始" + method.getName() +"...");
    }

    private void logAfter(Method method) {
        System.out.println(this.getClass().getName() + "结束" + method.getName() +"...");
    }
}
