package com.zs.sample.design.responsibility.basic;

public class Client {
    public static void main(String[] args) {
        // 1.构建责任链链条
        AbstractHandler handlerChain = new ConcreteHandler1();
        handlerChain.setNextHandler(new ConcreteHandler2());
        // 2.开始执行责任链
        handlerChain.handlerRequest();
    }
}
