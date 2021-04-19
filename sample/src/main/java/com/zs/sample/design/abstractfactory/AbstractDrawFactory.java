package com.zs.sample.design.abstractfactory;

/**
 * @Author: zhaoshuai
 * @Date: 2021/4/19
 */
public abstract class AbstractDrawFactory {
    protected abstract Color getColor(String color);
    protected abstract Shape getShape(String shape);
}
