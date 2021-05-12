package com.zs.sample.design.builder;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/12
 */
public class MealBuilder {
    /**
     * 烧鸡套餐: 烧鸡+可口可乐
     * @return
     */
    public Meal prepareChickenMeal (){
        Meal meal = new Meal();
        meal.addFood(new BBQChicken());
        meal.addFood(new Coke());
        return meal;
    }

    /**
     * 汉堡套餐: 汉堡+百世可乐
     * @return
     */
    public Meal prepareBurgerMeal (){
        Meal meal = new Meal();
        meal.addFood(new Burger());
        meal.addFood(new Pepsi());
        return meal;
    }
}
