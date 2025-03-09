package com.zs.sample.design.responsibility.filter;

public class AuthFilter implements Filter {

    public void doFilter(FilterChain chain) {
        System.out.println("我要进行权限检验");
        chain.doFilter();
        System.out.println("权限检验结束");
    }
}
