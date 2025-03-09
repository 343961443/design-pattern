package com.zs.sample.design.responsibility.log;

public class Client {
    public static void main(String[] args) {
        LogChain logChain = new LogChain();
        logChain.addLog(new DebugLog());
        logChain.addLog(new InfoLog());
        logChain.addLog(new ErrorLog());

        logChain.doWrite("我是日志内容", 1);
        System.out.println();
        logChain.doWrite("我是日志内容", 2);
        System.out.println();
        logChain.doWrite("我是日志内容", 3);
        System.out.println();
    }
}
