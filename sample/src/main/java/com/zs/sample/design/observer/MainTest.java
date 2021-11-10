package com.zs.sample.design.observer;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/10
 */
public class MainTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        // 观察者1,2观察上面的变化
        new Observer1(subject);
        new Observer2(subject);
        // 有变化，通知
        subject.notifyAllObserver();

    }
}
