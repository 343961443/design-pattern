package com.zs.sample.design.memento;

/**
 * @Author: zhaoshuai
 * @Date: 2021/10/29
 */
public class MainTest {
    public static void main(String[] args) {
        Taker taker = new Taker();

        // 通关第一关
        Originator originator = new Originator(1);
        // 通关第二关了
        originator.setStatus(2);
        originator.show();
        // 存档
        taker.add(originator.store(originator, "第二关过了"));

        // 通关第三关了
        originator.setStatus(3);
        originator.show();
        // 存档
        taker.add(originator.store(originator, "第三关过了"));

        // 展示一下存档
        taker.show();

        // 选择一个存档并恢复
        originator.recover(taker.get(0));
        // 恢复成功
        originator.show();



    }
}
