package com.zs.sample.design.adapter;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/14
 * 交流电转5V直流电适配器
 */
public interface ACToDC5VAdapter {
    boolean support(AC ac);
    int outputDC5V();
}
