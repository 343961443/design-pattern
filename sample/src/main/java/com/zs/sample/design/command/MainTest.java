package com.zs.sample.design.command;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/8
 */
public class MainTest {
    public static void main(String[] args) {
        // 组装receiver转换成command
        CommandConcatReceiver commandConcatReceiverA = new CommandConcatReceiver(new ReceiverA());
        CommandConcatReceiver commandConcatReceiverB = new CommandConcatReceiver(new ReceiverB());

        // 统一调用commandinvoker 执行
        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.addCommandList(commandConcatReceiverA);
        commandInvoker.addCommandList(commandConcatReceiverB);
        commandInvoker.executeCommandList();
    }
}
