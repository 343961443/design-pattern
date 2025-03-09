package com.zs.sample.design.responsibility.filter;

public class Client {
    public static void main(String[] args) {
        // 1.构建责任链链条
        ApplicationFilterChain chain = new ApplicationFilterChain();
        chain.addFilter(new ApplicationFilterConfig().setFilter(new AuthFilter()));
        chain.addFilter(new ApplicationFilterConfig().setFilter(new EncoderFilter()));

        // 2.开始执行责任链
        chain.doFilter();
    }
}
