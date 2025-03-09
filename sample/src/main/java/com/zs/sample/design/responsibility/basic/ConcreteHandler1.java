package com.zs.sample.design.responsibility.basic;

public class ConcreteHandler1 extends AbstractHandler {
    @Override
    public void handlerRequestInternal() {
        System.out.println("第一个具体处理者处理请求.....");
    }
}
