package com.zs.sample.design.command;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/8
 */
public class ReceiverA implements IReceiver {
    public void action() {
        System.out.println("ReceiverA do something");
    }
}
