package com.zs.sample.design.flyweight;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/22
 */
public class MainTest {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" , "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        for (String color : colors) {
            ColorFactory.getColor(color).draw();
        }
    }
}
