package com.zs.sample.design.responsibility.log;

import java.util.ArrayList;
import java.util.List;

public class LogChain {
    private List<Log> logList = new ArrayList<Log>();
    public void doWrite(String msg, int level) {
        for (Log log : logList) {
            if (log.getLevel() <= level ) {
                log.write(msg);
            }
        }
    }
    public void addLog(Log log) {
        logList.add(log);
    }
}
