package com.zs.sample.design.interpreter;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/10
 */
public class MainTest {
    public static void main(String[] args) {
        TerminalInterpreter terminalInterpreter1 = new TerminalInterpreter("男");
        TerminalInterpreter terminalInterpreter2 = new TerminalInterpreter("女");

        OrInterpreter orInterpreter = new OrInterpreter(terminalInterpreter1, terminalInterpreter2);
        System.out.println(orInterpreter.interpreter("john 是个男的"));

        AndInterpreter andInterpreter = new AndInterpreter(terminalInterpreter1, terminalInterpreter2);
        System.out.println(andInterpreter.interpreter("john 是个男的"));
    }
}
