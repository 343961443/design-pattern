package com.zs.sample.design.responsibility;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/31
 */
public class InfoLog extends AbstractLog{

    public InfoLog () {
        super.level = 2;
    }

    public void write(String msg) {
        System.out.println("\033[32;4m" + "info:" + msg + "\033[0m");
    }

}
