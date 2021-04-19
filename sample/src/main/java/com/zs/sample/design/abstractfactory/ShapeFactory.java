package com.zs.sample.design.abstractfactory;

/**
 * @Author: zhaoshuai
 * @Date: 2021/4/19
 */
public class ShapeFactory extends AbstractDrawFactory {
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shape) {
        if ("circle".equals(shape)) {
            return new Circle();
        } else if ("square".equals(shape)) {
            return new Square();
        } else {
            throw  new RuntimeException("不支持的形状");
        }
    }

}
