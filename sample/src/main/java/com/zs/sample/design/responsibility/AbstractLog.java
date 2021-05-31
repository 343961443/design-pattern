package com.zs.sample.design.responsibility;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/31
 */
public abstract class AbstractLog {


    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;
    protected int level = 0;

    protected AbstractLog nextAbstractLog;


    public void setNextAbstractLog(AbstractLog nextAbstractLog) {
        this.nextAbstractLog = nextAbstractLog;
    }

    public void log(int level, String msg) {
        if (this.level <= level) {
            this.write(msg);
        }
        if (this.nextAbstractLog != null) {
            nextAbstractLog.log(level, msg);
        }
    }
    public abstract void write(String msg);

}
