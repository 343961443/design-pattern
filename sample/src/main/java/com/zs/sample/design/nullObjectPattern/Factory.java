package com.zs.sample.design.nullObjectPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/25
 */
public class Factory {
    private List<Handler> list = new ArrayList<Handler>();

    public Factory() {
        list.add(new AHandler());
        list.add(new BHandler());
    }

    public Handler getHandler(String name) {
        for (Handler handler : list) {
            if (handler.name().equalsIgnoreCase(name)) {
                return handler;
            }
        }
        return new NullHandler();
    }
}
