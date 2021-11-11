package com.zs.sample.design.state;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/11
 */
public class ThirdGear extends GearState {
    public ThirdGear(Bike bike) {
        super(bike);
        bike.gearState = this;
    }

    public void GearUp() {
        System.out.println("已经是3档了，升不了了");
    }

    public void GearDown() {
        System.out.println("3档降级为2档");
        bike.gearState = new SecondGear(bike);
    }
}
