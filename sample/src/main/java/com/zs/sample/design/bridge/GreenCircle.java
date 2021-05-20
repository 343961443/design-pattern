package com.zs.sample.design.bridge;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/20
 */
public class GreenCircle implements DrawApi {

    public void draw() {
        System.out.println("绿色的圆");
    }
}
