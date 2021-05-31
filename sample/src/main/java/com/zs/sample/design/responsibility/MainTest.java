package com.zs.sample.design.responsibility;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/31
 * 责任链模式
 */
public class MainTest {
    public static void main(String[] args) {
        // 可以自行构建适当的链
        AbstractLog abstractLog = LogChain.getChain();
        // debug级别
        abstractLog.log(AbstractLog.DEBUG, "111");

        // info级别
        abstractLog.log(AbstractLog.INFO, "222");

        // error级别
        abstractLog.log(AbstractLog.ERROR, "333");
    }
}
