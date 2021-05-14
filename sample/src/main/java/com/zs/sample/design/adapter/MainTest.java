package com.zs.sample.design.adapter;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/14
 */
public class MainTest {
    public static void main(String[] args) {
        //220v电压要用它来充电
        AC ac220 = new AC220();
        DefaultACToDC5VAdapterRegistry defaultACToDC5VAdapterRegistry = new DefaultACToDC5VAdapterRegistry();
        defaultACToDC5VAdapterRegistry.getAdapter(ac220).outputDC5V();

        //110v电压要用它来充电
        AC ac110 = new AC110();
        defaultACToDC5VAdapterRegistry.getAdapter(ac110).outputDC5V();
    }
}
