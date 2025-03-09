package com.zs.sample.design.responsibility.log;

public class DebugLog implements Log {
    public void write(String msg) {
        System.out.println("debug:" + msg);
    }

    public int getLevel() {
        return 3;
    }
}
