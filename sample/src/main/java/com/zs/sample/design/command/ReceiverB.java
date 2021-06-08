package com.zs.sample.design.command;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/8
 */
public class ReceiverB implements IReceiver {
    public void action() {
        System.out.println("ReceiverB do something");
    }
}
