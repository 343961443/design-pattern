package com.zs.sample.design.responsibility.inter;

import com.zs.sample.design.responsibility.basic.AbstractHandler;

public class ConcreteHandler2 implements Handler {

    public void handleRequest() {
        System.out.println("第二个具体处理者处理请求.....");
    }
}
