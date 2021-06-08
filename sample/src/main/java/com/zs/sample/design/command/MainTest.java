package com.zs.sample.design.command;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/8
 */
public class MainTest {
    public static void main(String[] args) {
        // 通过receiver转换成command
        ICommand commandA = new ReceiverConvertCommand(new ReceiverA());
        ICommand commandB = new ReceiverConvertCommand(new ReceiverB());

        // 统一调用commandinvoker 执行
        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.addCommandList(commandA);
        commandInvoker.addCommandList(commandB);
        commandInvoker.executeCommandList();

        // 如果有新的命令执行者ReceiverC，那么只用增加一个类实现其方法即可。其他框架细节不用变
    }
}
