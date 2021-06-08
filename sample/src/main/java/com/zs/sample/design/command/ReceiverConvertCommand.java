package com.zs.sample.design.command;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/8
 */
public class ReceiverConvertCommand implements ICommand {

    private IReceiver receiver;

    public ReceiverConvertCommand(IReceiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }
}
