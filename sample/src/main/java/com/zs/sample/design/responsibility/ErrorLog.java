package com.zs.sample.design.responsibility;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/31
 */
public class ErrorLog extends AbstractLog {

    public ErrorLog () {
        super.level = 3;
    }

    public void write(String msg) {
        System.out.println("\033[1;31m" +"error:" + msg + "\033[0m");
    }
}
