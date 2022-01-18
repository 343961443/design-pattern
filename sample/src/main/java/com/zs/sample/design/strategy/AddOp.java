package com.zs.sample.design.strategy;

/**
 * @Author: zhaoshuai
 * @Date: 2022/1/18
 */
public class AddOp implements Operator {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
