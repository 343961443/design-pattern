package com.zs.sample.design.nullObjectPattern;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/25
 */
public class BHandler implements Handler {
    public void handle() {
        System.out.println("do " + this.getClass().getName());
    }

    public String name() {
        return "B";
    }
}
