package com.zs.sample.design.memento;

/**
 * @Author: zhaoshuai
 * @Date: 2021/10/29
 */
public class Originator {

    public Originator(int status) {
        this.status = status;
    }

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Memento store(Originator originator, String message) {
        return new Memento(originator.getStatus(), message);
    }

    public void recover(Memento memento) {
        System.out.println("开始从存档恢复数据...");
        this.status = memento.getStatus();
    }

    public void show() {
        System.out.println("成功通过第" + this.status + "关");
    }
}
