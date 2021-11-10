package com.zs.sample.design.observer.jdk;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/10
 */
public class MainTest {
    public static void main(String[] args) {
        SubjectExtend subjectExtend = new SubjectExtend();
        Observer1 observer1 = new Observer1();
        subjectExtend.addObserver(observer1);

        // 要标记变化
        subjectExtend.setChanged();
        // 通知
        subjectExtend.notifyObservers();
    }
}
