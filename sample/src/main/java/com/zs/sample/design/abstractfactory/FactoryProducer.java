package com.zs.sample.design.abstractfactory;

/**
 * @Author: zhaoshuai
 * @Date: 2021/4/19
 */
public class FactoryProducer {
    public static AbstractDrawFactory getFactory(String factory) {
        if ("color".equals(factory)) {
            return new ColorFactory();
        } else if ("shape".equals(factory)) {
            return new ShapeFactory();
        } else {
            throw new RuntimeException("不支持的Factory类型");
        }
    }
}
