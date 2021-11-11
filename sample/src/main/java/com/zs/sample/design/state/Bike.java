package com.zs.sample.design.state;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/11
 */
public class Bike {
    GearState gearState;

    public Bike () {
        gearState = new FirstGear(this);
    }
    public void gearUp() {

        gearState.GearUp();
    }
    public void gearDown() {
        gearState.GearDown();
    }
}
