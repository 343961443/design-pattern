package com.zs.sample.design.factory;

/**
 * 工厂模式入口代码
 * @Author: zhaoshuai
 * @Date: 2021/4/15
 */
public class FactoryTest {
    public static void main(String[] args) {
        // 初始工厂
        AnimalFactory animalFactory = new AnimalFactory();
        // 从工厂中拿到小狗
        Animal dog = animalFactory.getAnimal("dog");
        // 狗叫
        dog.sound();
        Animal cat = animalFactory.getAnimal("cat");
        // 猫叫
        cat.sound();
    }
}
