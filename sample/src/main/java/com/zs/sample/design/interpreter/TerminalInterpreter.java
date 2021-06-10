package com.zs.sample.design.interpreter;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/10
 */
public class TerminalInterpreter implements Interpreter {
    private String data;

    public TerminalInterpreter (String data) {
        this.data = data;
    }

    public boolean interpreter(String content) {
        return content.contains(data);
    }
}
