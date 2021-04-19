package com.zs.sample.design.abstractfactory;

/**
 * @Author: zhaoshuai
 * @Date: 2021/4/19
 */
public class ColorFactory extends AbstractDrawFactory {
    public Color getColor(String color) {
        if ("red".equals(color)) {
            return new Red();
        } else if ("green".equals(color)) {
            return new Green();
        } else {
            throw  new RuntimeException("不支持的颜色");
        }

    }
    protected Shape getShape(String shape) {
        return null;
    }

}
