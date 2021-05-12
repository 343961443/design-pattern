package com.zs.sample.design.singleton;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/11
 */
public class StaticSingleton {

    private static class SingletonHolder {
        {
            System.out.println("SingletonHolder{}");
        }
        static {
            System.out.println("SingletonHolder static{}");
        }
        public SingletonHolder() {
            System.out.println("SingletonHolder constructor init");
        }
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton (){
        System.out.println("StaticSingleton constructor init");
    }

    public static final StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
