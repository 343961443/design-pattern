package com.zs.sample.design.observer;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/10
 */
public class Observer1 implements Observer {

    public Observer1(Subject subject) {
        subject.addObserver(this);
    }

    public void update() {
        System.out.println(this.getClass().getName() + "收到变化");
    }
}
