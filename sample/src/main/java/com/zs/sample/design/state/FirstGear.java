package com.zs.sample.design.state;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/11
 */
public class FirstGear extends GearState{
    public FirstGear(Bike bike) {
        super(bike);
        bike.gearState = this;
    }

    public void GearUp() {
        System.out.println("1档变2档");
        bike.gearState = new SecondGear(bike);
    }

    public void GearDown() {
        System.out.println("1档降档不了");
    }
}
