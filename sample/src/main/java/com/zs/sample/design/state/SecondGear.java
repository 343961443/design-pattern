package com.zs.sample.design.state;

/**
 * @Author: zhaoshuai
 * @Date: 2021/11/11
 */
public class SecondGear  extends GearState  {
    public SecondGear(Bike bike) {
        super(bike);
        bike.gearState = this;
    }

    public void GearUp() {
        System.out.println("2档变3档");
        bike.gearState = new ThirdGear(bike);
    }

    public void GearDown() {
        System.out.println("2档变1档");
        bike.gearState = new FirstGear(bike);
    }
}
