package com.zs.sample.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/10/29
 */
public class Taker {
    List<Memento> mementoList = new ArrayList();

    public Memento get(int i) {
        return mementoList.get(i);
    }

    public void add(Memento memento) {
        this.mementoList.add(memento);
    }

    public void show() {
        int i = 0;
        for (Memento memento : mementoList) {
            System.out.println("存档" + i++ +":->" + memento.getMessage() + ":状态" + memento.getStatus());
        }
    }
}
