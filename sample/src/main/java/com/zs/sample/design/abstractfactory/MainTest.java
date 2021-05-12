package com.zs.sample.design.abstractfactory;

/**
 * @Author: zhaoshuai
 * @Date: 2021/4/19
 */
public class MainTest {
    public static void main(String[] args) {
        // 获得形状工厂
        AbstractDrawFactory shapeFactory = FactoryProducer.getFactory("shape");
        // 画圆
        Shape circleShape = shapeFactory.getShape("circle");
        circleShape.draw();

        // 画方
        Shape squareShape = shapeFactory.getShape("square");
        squareShape.draw();

        // 获得颜色工厂
        AbstractDrawFactory colorFactory = FactoryProducer.getFactory("color");
        // 填充红色
        Color redColor = colorFactory.getColor("red");
        redColor.fill();
        // 填充绿色
        Color greenColor = colorFactory.getColor("green");
        greenColor.fill();
    }
}
