package com.zs.sample.design.singleton;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/11
 * 懒汉式，线程安全
 * 没有锁，获取时效率高。
 * 类加载时初始化，浪费内存
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){

    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}

