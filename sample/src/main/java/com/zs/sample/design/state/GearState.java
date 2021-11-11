package com.zs.sample.design.state;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/11
 */
public abstract class GearState {
    protected Bike bike;
    GearState(Bike bike) {
        this.bike = bike;
    }

    abstract void GearUp();

    abstract void GearDown();
}
