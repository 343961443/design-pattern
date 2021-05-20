package com.zs.sample.design.bridge;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/20
 */
public class MainTest {
    public static void main(String[] args) {
        CircleShape redCircleShape = new CircleShape(new RedCircle());
        redCircleShape.draw();


        CircleShape greenCircleShape = new CircleShape(new GreenCircle());
        greenCircleShape.draw();
    }
}
