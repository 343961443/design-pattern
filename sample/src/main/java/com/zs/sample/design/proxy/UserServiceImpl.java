package com.zs.sample.design.proxy;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/22
 */
public class UserServiceImpl implements UserService {


    public void createUser() {
        System.out.println("创建用户了啊");
    }

    public void updateUser() {
        System.out.println("修改用户了啊");
    }
}
