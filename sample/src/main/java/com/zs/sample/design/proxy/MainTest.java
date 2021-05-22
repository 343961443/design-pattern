package com.zs.sample.design.proxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/22
 */
public class MainTest {
    public static void main(String[] args) {
        /** 静态代理模式 begin**/
        UserService staticUserService = new StaticUserServiceProxy(new UserServiceImpl());
        staticUserService.createUser();
        staticUserService.updateUser();
        /** 静态代理模式 end**/


        /** jdk动态代理模式 begin**/
        // 保存生成的文件。一般在默认路径是根路径com.sun.proxy
        // 本项目中com/sun/$Proxy0.class是生成的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // UserServiceImpl 必须要有实现接口userService,否则无法进行类型转换
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        JDKUserServiceProxy jdkUserServiceProxy = new JDKUserServiceProxy(userServiceImpl);
        UserService userService = (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(), UserServiceImpl.class.getInterfaces(), jdkUserServiceProxy);
        UserService userService2 = (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(), UserServiceImpl.class.getInterfaces(), jdkUserServiceProxy);
        System.out.println("userService == userService2=》" + (userService == userService2));
        userService.createUser();
        userService.updateUser();
        /** jdk动态代理模式 end**/

        /** cglib字节码增强代理模式 begin **/
        // 代理类class文件存入本地磁盘方便我们反编译查看源码
        String dir = System.getProperty("user.dir");
        // 本项目中com/sun/有生成相应的文件
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, dir + "\\com\\sun\\proxy");
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(UserServiceImpl.class);
        // 设置callback函数，代理调用，其实就是切面

        //可以有选择的对一些方法使用回调。当Enhancer.setCallbacks(Callback[])设置多个callback时，
        //必须设置CallbackFilter来确保一个代理类只能接受一个拦截。返回值表示数组下标
        // 如果只有一个callback,无需setCallbackFilter
        enhancer.setCallbacks(new Callback [] {new CglibUserServiceProxy1(),new CglibUserServiceProxy2()});
        enhancer.setCallbackFilter(new CallbackFilter() {
            public int accept(Method method) {
                if ("createUser".equals(method.getName())) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        UserService userService3 = (UserService)enhancer.create();
        userService3.createUser();
        userService3.updateUser();
        /** cglib字节码增强代理模式 end **/


    }
}
