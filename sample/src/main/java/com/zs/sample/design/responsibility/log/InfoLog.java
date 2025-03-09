package com.zs.sample.design.responsibility.log;

public class InfoLog implements Log {
    public void write(String msg) {
        System.out.println("info:" + msg);
    }

    public int getLevel() {
        return 2;
    }
}
