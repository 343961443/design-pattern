package com.zs.sample.design.strategy;

/**
 * @Author: zhaoshuai
 * @Date: 2022/1/18
 */
public class MainTest {
    public static void main(String[] args) {
        //定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
        //一个类的行为或其算法可以在运行时更改.
        //在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
        Context context = new Context(new AddOp());
        context.execute(1, 2);
        context = new Context(new SubOp());
        context.execute(1, 2);
    }
}
