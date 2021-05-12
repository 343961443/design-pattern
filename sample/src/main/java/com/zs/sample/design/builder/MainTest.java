package com.zs.sample.design.builder;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/12
 */
public class MainTest {
    public static void main(String[] args) {
        // 点餐，点个烧鸡套餐
        MealBuilder mealBuilder = new MealBuilder();
        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        chickenMeal.showFoods();
        chickenMeal.getCost();
        // 点个汉堡套餐
        Meal burger = mealBuilder.prepareBurgerMeal();
        burger.showFoods();
        burger.getCost();
    }
}
