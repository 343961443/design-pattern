package com.zs.sample.design.bridge;

import com.zs.sample.design.abstractfactory.Circle;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/20
 */
public class CircleShape extends Shape {

    public CircleShape(DrawApi drawApi) {
        super(drawApi);
    }


}
