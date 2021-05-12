package com.zs.sample.design.builder;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/12
 */
public class Burger implements Food {
    public String name() {
        return "汉堡包";
    }

    public float price() {
        return 10;
    }
}
