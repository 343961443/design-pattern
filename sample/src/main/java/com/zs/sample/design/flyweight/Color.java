package com.zs.sample.design.flyweight;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/22
 */
public class Color {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("颜色是：" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }
}
