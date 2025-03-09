package com.zs.sample.design.responsibility.log;

public class ErrorLog implements Log {
    public void write(String msg) {
        System.out.println("error:" + msg);
    }

    public int getLevel() {
        return 1;
    }
}
