package com.zs.sample.design.adapter;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/14
 * 输出110V交流电
 */
public class AC220 implements AC {
    private int ac = 220;

    public int outPutAC() {
        return ac;
    }


}
