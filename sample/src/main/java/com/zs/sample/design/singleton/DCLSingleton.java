package com.zs.sample.design.singleton;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/11
 * double-checked locking
 * 双重锁校验
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 * 推荐使用这种方式
 */
public class DCLSingleton {
    private static volatile DCLSingleton singleton;
    private DCLSingleton (){}
    public static DCLSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
