package com.zs.sample.design.adapter;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/14
 * 220v交流转5v直流
 */
public class AC220ToDC5VAdapter implements ACToDC5VAdapter {
    private AC220 ac220 = new AC220();

    public boolean support(AC ac) {
        return ac.outPutAC() == ac220.outPutAC();
    }

    public int outputDC5V() {
        System.out.println("正在使用220v->5v充电");
        return ac220.outPutAC()/22;
    }
}
