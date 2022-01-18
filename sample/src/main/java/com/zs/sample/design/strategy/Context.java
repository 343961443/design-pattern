package com.zs.sample.design.strategy;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zhaoshuai
 * @Date: 2022/1/18
 */
public class Context {
    private Operator operator;
    public Context(Operator operator) {
        this.operator = operator;
    }
    public void execute(int num1, int num2) {
        System.out.println(operator.doOperation(num1, num2));
    }
}
