package com.zs.sample.design.singleton;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/11
 * 懒汉式
 * 多线程的确能很好工作
 * 但是效率低的不行，因为初始化完了之后，大部分情况下都是不需要锁的
 * 不推荐
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton (){}
    public static synchronized LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
