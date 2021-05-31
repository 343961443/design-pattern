package com.zs.sample.design.responsibility;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/31
 */
public class LogChain {
    public static AbstractLog getChain() {
        AbstractLog debug = new DebugLog();
        AbstractLog info = new InfoLog();
        AbstractLog error = new ErrorLog();
        error.setNextAbstractLog(info);
        info.setNextAbstractLog(debug);
        return error;
    }


}
