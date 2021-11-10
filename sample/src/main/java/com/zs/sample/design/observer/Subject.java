package com.zs.sample.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/10
 */
public class Subject {
    private List<Observer> observerList;

    public Subject() {
        observerList = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }
    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

}
