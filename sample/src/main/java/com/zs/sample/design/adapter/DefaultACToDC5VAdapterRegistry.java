package com.zs.sample.design.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/14
 */
public class DefaultACToDC5VAdapterRegistry {
    private final List<ACToDC5VAdapter> adapters = new ArrayList(3);

    public DefaultACToDC5VAdapterRegistry() {
        this.adapters.add(new AC110ToDC5VAdapter());
        this.adapters.add(new AC220ToDC5VAdapter());
    }

    public ACToDC5VAdapter getAdapter(AC ac) {
        for (ACToDC5VAdapter adapter : adapters) {
            if (adapter.support(ac)) {
                return adapter;
            }
        }
        throw new RuntimeException("找不到变压器");
    }
}
