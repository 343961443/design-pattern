package com.zs.sample.design.responsibility.filter;

import java.io.IOException;
import java.security.Principal;
import java.security.PrivilegedActionException;

public class ApplicationFilterChain implements FilterChain {
    //filter总数
    int n;
    //扩容值
    int INCREMENT = 10;
    //当前位置
    int pos;

    private ApplicationFilterConfig[] filters = new ApplicationFilterConfig[0];
    public void addFilter(ApplicationFilterConfig filterConfig) {
        //扩容
        if (n == filters.length) {
            ApplicationFilterConfig[] newFilters = new ApplicationFilterConfig[n + INCREMENT];
            System.arraycopy(filters, 0, newFilters, 0, n);
            filters = newFilters;
        }
        //添加这个过滤器
        filters[n++] = filterConfig;
    }
    public void doFilter() {
        internalDoFilter();
    }
    public void internalDoFilter() {
        if (pos < n) {
            ApplicationFilterConfig filterConfig = filters[pos++];
            Filter filter = filterConfig.getFilter();
            filter.doFilter(this);
        }
    }

}
