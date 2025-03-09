package com.zs.sample.design.responsibility.filter;

public class EncoderFilter implements Filter {

    public void doFilter(FilterChain chain) {
        System.out.println("我要进行编码检验");
        chain.doFilter();
        System.out.println("编码检验结束");
    }
}
