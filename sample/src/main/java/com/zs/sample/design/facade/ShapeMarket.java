package com.zs.sample.design.facade;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/22
 */
public class ShapeMarket {
    private Shape circleShape;
    private Shape squareShape;

    public ShapeMarket(){
        circleShape = new CircleShape();
        squareShape = new SquareShape();
    }
    public void drawCircle() {
        circleShape.draw();
    }
    public void drawSquare() {
        squareShape.draw();
    }
}
