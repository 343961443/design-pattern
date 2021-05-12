package com.zs.sample.design.builder;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/12
 */
public class Coke implements Food{

    public String name() {
        return "可口可乐";
    }

    public float price() {
        return 2;
    }
}
