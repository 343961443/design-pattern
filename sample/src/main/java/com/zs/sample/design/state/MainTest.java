package com.zs.sample.design.state;

import com.zs.sample.design.state.Bike;

/**
 * @Author: zhaoshuai
 * @Date: 2021/4/15
 */
public class MainTest {
    public static void main(String[] args) {
        // 有人在骑自行车，自行车是变速自行车，有3档，刚开始起步是1挡
        Bike bike = new Bike();
        // 他要加速 1档变2档
        bike.gearUp();
        // 再加速 2档变3档
        bike.gearUp();
        // 再加速 已经是3档了，升不了了
        bike.gearUp();
        // 减速 3档降级为2档
        bike.gearDown();
        // 减速 2档变1档
        bike.gearDown();
        // 减速 1档降档不了
        bike.gearDown();
    }
}
