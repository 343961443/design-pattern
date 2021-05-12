package com.zs.sample.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/12
 */
public class Meal {
    private List<Food> items = new ArrayList<Food>();

    public void addFood(Food item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Food item : items) {
            cost += item.price();
        }
        System.out.println("共计=>"+ cost + "元);");
        return cost;
    }

    public void showFoods(){
        for (Food item : items) {
            System.out.print("Food=>"+item.name() + "("+item.price() + "元);");
        }
        System.out.println("");
    }
}
