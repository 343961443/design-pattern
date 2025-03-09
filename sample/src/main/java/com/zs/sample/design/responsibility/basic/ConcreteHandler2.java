package com.zs.sample.design.responsibility.basic;

public class ConcreteHandler2 extends AbstractHandler {
    @Override
    public void handlerRequestInternal() {
        System.out.println("第二个具体处理者处理请求.....");

    }
}
