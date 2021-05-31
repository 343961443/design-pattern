package com.zs.sample.design.responsibility;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/31
 */
public class DebugLog extends AbstractLog {

    public DebugLog () {
        super.level = 1;
    }


    public void write(String msg) {
        System.out.println("\033[1;30m" +"debug:" + msg + "\033[0m");
    }


}
