package com.zs.sample.design.responsibility.inter;

import com.zs.sample.design.responsibility.basic.AbstractHandler;

public class ConcreteHandler1 implements Handler {
    public void handleRequest() {
        System.out.println("第一个具体处理者处理请求.....");
    }
}
