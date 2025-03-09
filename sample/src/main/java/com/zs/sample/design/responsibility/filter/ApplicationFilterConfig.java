package com.zs.sample.design.responsibility.filter;

public class ApplicationFilterConfig {
    public Filter filter;

    public Filter getFilter() {
        return filter;
    }

    public ApplicationFilterConfig setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }
}
