package com.zs.sample.design.builder;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/12
 */
public class BBQChicken implements Food {
    public String name() {
        return "烧鸡";
    }

    public float price() {
        return 100;
    }
}
