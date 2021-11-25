package com.zs.sample.design.nullObjectPattern;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/25
 */
public class MainTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.getHandler("A").handle();
        factory.getHandler("B").handle();
        // c不存在，不会爆NPE
        factory.getHandler("C").handle();
    }
}
