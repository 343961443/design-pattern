package com.zs.sample.design.facade;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/22
 */
public class MainTest {
    public static void main(String[] args) {
        // 外观模式 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
        ShapeMarket shapeMarket = new ShapeMarket();
        shapeMarket.drawCircle();
        shapeMarket.drawSquare();
    }
}
