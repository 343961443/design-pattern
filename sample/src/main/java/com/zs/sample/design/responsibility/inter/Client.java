package com.zs.sample.design.responsibility.inter;

import com.zs.sample.design.responsibility.basic.AbstractHandler;

public class Client {
    public static void main(String[] args) {
        // 1.构建责任链链条
        Chain chain = new Chain();
        chain.addHandler(new ConcreteHandler1());
        chain.addHandler(new ConcreteHandler2());

        // 2.开始执行责任链
        chain.doHandler();
    }
}
