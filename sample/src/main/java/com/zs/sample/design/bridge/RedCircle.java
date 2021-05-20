package com.zs.sample.design.bridge;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/20
 */
public class RedCircle implements DrawApi {
    public void draw() {
        System.out.println("红色的圆");
    }
}
