package com.zs.sample.design.adapter;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/14
 * 110v交流转5v直流
 */
public class AC110ToDC5VAdapter implements ACToDC5VAdapter {
    private AC110 ac110 = new AC110();

    public boolean support(AC ac) {
        return ac.outPutAC() == ac110.outPutAC();
    }

    public int outputDC5V() {
        System.out.println("正在使用110v->5v充电");
        return ac110.outPutAC() / 44;
    }
}
