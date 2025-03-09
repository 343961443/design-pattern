package com.zs.sample.design.responsibility.filter;

import java.io.IOException;

public interface Filter {
    void doFilter(FilterChain chain);
}
