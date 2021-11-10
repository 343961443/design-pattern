package com.zs.sample.design.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/10
 */
public class Observer1 implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println(o.getClass().getName() + ":notify->" + this.getClass().getName() + ":"+ arg);
    }
}
