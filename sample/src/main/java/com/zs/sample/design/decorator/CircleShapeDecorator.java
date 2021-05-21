package com.zs.sample.design.decorator;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/21
 */
public class CircleShapeDecorator implements Shape {
    protected Shape shape;
    public CircleShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    public void draw(){
        shape.draw();
        System.out.println("还画了个线");
    }

}
