package com.zs.sample.design.observer.jdk;

import java.util.Observable;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/10
 */
public class SubjectExtend extends Observable {
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}
