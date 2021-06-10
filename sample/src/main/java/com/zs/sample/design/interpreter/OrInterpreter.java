package com.zs.sample.design.interpreter;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/10
 */
public class OrInterpreter {
    private Interpreter interpreter1;
    private Interpreter interpreter2;

    public OrInterpreter(Interpreter interpreter1, Interpreter interpreter2) {
        this.interpreter1 = interpreter1;
        this.interpreter2 = interpreter2;
    }

    public boolean interpreter(String content) {
        return interpreter2.interpreter(content) || interpreter1.interpreter(content);
    }
}
