package com.zs.sample.design.responsibility.inter;

import java.util.ArrayList;
import java.util.List;

public class Chain {
    private List<Handler> handlerList = new ArrayList<Handler>();

    public void addHandler(Handler handler) {
        handlerList.add(handler);
    }
    public void doHandler() {
        for (Handler handler : handlerList) {
            handler.handleRequest();
        }
    }
}
