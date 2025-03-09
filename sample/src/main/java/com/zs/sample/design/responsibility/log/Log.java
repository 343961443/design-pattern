package com.zs.sample.design.responsibility.log;

public interface Log {
    void write(String msg);
    int getLevel();
}
