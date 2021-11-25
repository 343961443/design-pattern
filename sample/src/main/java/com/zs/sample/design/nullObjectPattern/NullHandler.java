package com.zs.sample.design.nullObjectPattern;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/25
 */
public class NullHandler implements Handler {
    public void handle() {
        System.out.println("do noting");
    }

    public String name() {
        return null;
    }
}
