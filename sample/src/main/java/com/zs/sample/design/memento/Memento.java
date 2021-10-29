package com.zs.sample.design.memento;

/**
 * @Author: zhaoshuai
 * @Date: 2021/10/29
 */
public class Memento {
    private int status;

    private String message;



    public Memento(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Memento(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
