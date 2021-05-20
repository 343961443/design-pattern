package com.zs.sample.design.bridge;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/20
 */
public abstract class AbstractShape {
    protected DrawApi drawApi;

    protected AbstractShape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    protected void draw() {
        drawApi.draw();
    }
}
