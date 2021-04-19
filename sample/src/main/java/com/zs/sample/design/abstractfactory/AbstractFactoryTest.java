package com.zs.sample.design.abstractfactory;

/**
 * @Author: zhaoshuai
 * @Date: 2021/4/19
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractDrawFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circleShape = shapeFactory.getShape("circle");
        circleShape.draw();

        Shape squareShape = shapeFactory.getShape("square");
        squareShape.draw();

        AbstractDrawFactory colorFactory = FactoryProducer.getFactory("color");
        Color redColor = colorFactory.getColor("red");
        redColor.fill();

        Color greenColor = colorFactory.getColor("green");
        greenColor.fill();
    }
}
