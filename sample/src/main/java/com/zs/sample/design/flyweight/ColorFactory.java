package com.zs.sample.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/22
 */
public class ColorFactory {
    private static final Map<String,Color> colorMap = new HashMap<String, Color>();

    public static Color getColor(String color) {
        Color circle = colorMap.get(color);
        if(circle == null) {
            circle = new Color(color);
            colorMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
